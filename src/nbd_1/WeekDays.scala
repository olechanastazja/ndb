package nbd_1

import scala.annotation.tailrec

object WeekDays  {
    var week_days = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

    def main(args: Array[String]) {
      println("All week days: " + allWeekDays());
      println("Week days starting with P: " + pWeekDays());
      println("Week days using while : " + weekDaysUsingWhile());
      println("Week days using recursion : " + weekDaysRecursion(week_days));
      println("Week days backwards using recursion : " + weekDaysBackwardsRecursion(week_days));
      println("Week days using tail recursion : " + weekDaysTailRecursion(week_days));
      println("Week days using fold left: " + weekDaysUsingFoldLeft());
      println("Week days using fold right: " + weekDaysUsingFoldRight());
      println("Week days starting with P using fold left: " + pWeekDaysUsingFoldLeft());
    }

    // zadanie 1
    def allWeekDays() : String = {
      var result = ""
      for (day <- week_days)
        result = result.concat(day + ',')
      result
    }

    def pWeekDays() : String = {
      var result = ""
      for (day <- week_days)
        if (day.startsWith("P")) {
          result = result.concat(day + ',')
        }
      result
    }

    def weekDaysUsingWhile() : String = {
      var result = ""
      var counter = 0
      while (counter < week_days.length) {
        result = result.concat(week_days(counter) + ',')
        counter +=  1
      }
      result
    }

    // zadanie 2
    def weekDaysRecursion(l : List[String]): String = {
      if (l.isEmpty)
        ""
      else l.head + "," + weekDaysRecursion(l.tail)
    }

    def weekDaysBackwardsRecursion(l : List[String]): String = {
      if (l.isEmpty)
        ""
      else weekDaysBackwardsRecursion(l.tail)+ l.head  + ","
    }

    // zadanie 3
    def weekDaysTailRecursion(l : List[String]): String = {
      @tailrec
      def iter(x: List[String], result: String): String =
        if (x.isEmpty) result
        else {
          iter(x.tail, result + x.head + ",")
        }
      iter(l, "")
    }

    // zadanie 4
    def weekDaysUsingFoldLeft() : String = {
      week_days.foldLeft("")(_  + _ + ",")
    }

    def weekDaysUsingFoldRight() : String = {
      week_days.foldRight("")(_  +  "," + _ )
    }

    def pWeekDaysUsingFoldLeft() : String = {
      week_days.foldLeft(""){(z,f) => if (f.startsWith("P")) z + f + "," else z }
    }

}
