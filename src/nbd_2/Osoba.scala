package nbd_2

class Osoba(val imie: String, val nazwisko: String, val podatek: Double){}

trait Student extends Osoba {
  override val podatek: Double = 0
}

trait Pracownik extends Osoba {
  var _pensja = 100
  override val podatek: Double = 0.2 * _pensja
  def pensja: Double = _pensja
  def pensja_(pensja: Int):Unit = _pensja = pensja
}


trait Nauczyciel extends Pracownik {
  override val podatek: Double = 0.1 * pensja
}

class StudentInformatyki(imie:String, nazwisko:String, podatek:Double)
  extends Osoba(imie, nazwisko, podatek) with Student

class PracownikNaukowy(imie:String, nazwisko:String, podatek:Double)
  extends Osoba(imie, nazwisko, podatek) with Pracownik {
}
class NauczycielInformatyki(imie:String, nazwisko:String, podatek:Double)
  extends Osoba(imie, nazwisko, podatek) with Nauczyciel {
}

object TestOsoba {

  def main(args: Array[String]) {
    val student = new StudentInformatyki("Jan", "Kowalski", 23)
    println(student.podatek)
    val pracownik = new PracownikNaukowy("Józef", "Nowak", 35)
    println(pracownik.podatek)
    val nauczyciel = new NauczycielInformatyki("Krzysztof", "Małachowski", 45)
    println(nauczyciel.podatek)
  }

}

