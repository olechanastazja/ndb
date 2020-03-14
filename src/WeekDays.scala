object WeekDays  {
    var week_days = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

    def main(args: Array[String]) {
      println("All week days: " + allWeekDays());
      println("Week days starting with P: " + pWeekDays());
      println("Week days using while : " + weekDaysUsingWhile());
      println("Week days using recursion : " + weekDaysRecursion(week_days));
      println("Week days backwards using recursion : " + weekDaysBackwardsRecursion(week_days));
    }

    // zadanie 1
    def allWeekDays() : String = {
      var result = ""
      for (day <- week_days)
        result = result.concat(day + ',')
      return result
    }

    def pWeekDays() : String = {
      var result = ""
      for (day <- week_days)
        if (day.startsWith("P")) {
          result = result.concat(day + ',')
        }
      return result
    }

    def weekDaysUsingWhile() : String = {
      var result = ""
      var counter = 0
      while (counter < week_days.length) {
        result = result.concat(week_days(counter) + ',')
        counter +=  1
      }
      return result
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


}
