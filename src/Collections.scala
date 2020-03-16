import scala.language.postfixOps

object Collections {

  val mapProducts = Map("Chocolate" -> 20,
    "Ice cream" -> 30,
    "Apple" -> 10)
  val myTuple: (Int, String, Double) = Tuple3(6, "ABC", 2.0)
  val myList = List(6, 8, 0, 2, 0, 10)
  val realNumbers = List(2.22, -5, 12, 11.5,-3.4, 5.14, 0, -30)

  def main(args: Array[String]) {
    println("New map after discount: " + createProductMaps())
    printDiverseTuple(myTuple)
    showOption()
    println("Remove zeros from list: " + removeZeros(myList))
    println("Increment list elements by one: " + incrementListByOne(myList))
    println("Absolute values from range: " + absoluteValuesList(realNumbers))
  }

  // zadanie 5
  def createProductMaps() : Map[String, Double] = {
    val afterDiscount = mapProducts.map(kv => (kv._1, kv._2*0.9))
    afterDiscount
  }
  // zadanie 6
  def printDiverseTuple(myTuple: (Int, String, Double)) : Unit = {
    myTuple.productIterator.foreach(x => {
      println(x)
    })
  }
  // zadanie 7
  def showOption() : Unit = {
    println(mapProducts.get("Chocolate"))
    println(mapProducts.get("Ice cream"))
    println(mapProducts.get("Broccoli"))
  }

  // zadanie 8
  def removeZeros(l: List[Int]) : List[Int] = {
    if (l.isEmpty) l
    else {
      if (l.head == 0) {
        removeZeros(l.tail)
      }
      else List(l.head) ::: removeZeros(l.tail)
    }
  }

  // zadanie 9
  def incrementListByOne(l: List[Int]) : List[Int] = {
    l.map((x => x+1) )
  }

  // zadanie 10
  def absoluteValuesList(l: List[Double]) : List[Double] = {
    l.filter(x => (x >= -5.0 && x <= 12.0)).map(_ abs)
  }

}
