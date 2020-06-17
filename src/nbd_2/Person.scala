package nbd_2

case class Person(firstName: String, lastName: String)

object TestPerson {

  def main(args: Array[String]) {
    val firstPerson = new Person("Omar", "Little")
    val secondPerson = new Person("Russell", "Bell")
    val thirdPerson = new Person("Reginald", "Cousins")
    val fourthPerson = new Person("Agnieszka", "Olech")
    println(sayHi(firstPerson))
    println(sayHi(secondPerson))
    println(sayHi(thirdPerson))
    println(sayHi(fourthPerson))

  }

  def sayHi(p:Person) : String = p match {
    case Person("Omar", "Little") => "Yo Omar!"
    case Person(_,"Bell") => "Hi Stringer"
    case Person("Reginald",_) => "Hello Bubbles"
    case Person(firstName,_) => s"Good Morning $firstName"
  }

}

