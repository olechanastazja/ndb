package nbd_2


object PatternMatching {
  val work_days = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek")
  val weekend_days = List("Sobota", "Niedziela")

  def main(args: Array[String]) {
    println(isItWeekend("Sobota"))
  }

  // zadanie 1
  def isItWeekend(day: String): String  = day match {
    case day if work_days.contains(day) => "Praca"
    case day if weekend_days.contains(day) => "Weekend"
    case day => "Nie ma takiego dnia"
  }
}
