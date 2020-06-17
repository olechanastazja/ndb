package nbd_2


class KontoBankowe(val stanKonta: Int) {

  def this() {
    this(0);
  }

  def wplata(kwota: Int): Unit = {}

  def wyplata(kwota: Int): Unit = {}

}

object Test {

  def main(args: Array[String]) {

    // Pierwszy konstruktow
    val first = new KontoBankowe()
    println(first.stanKonta)

    // Drugi konstruktor
    val second = new KontoBankowe(100)
    println(second.stanKonta)

  }

}