object Collections {

  def main(args: Array[String]) {
    println("New map after discount: " + createProductMaps())
    val myTuple = (6, "ABC", 2.0)
    println("Diverse tuple: " + printDiverseTuple(myTuple))
  }

  // zadanie 5
  def createProductMaps() : Map[String, Double] = {
    val mapProducts = Map("Chocolate" -> 20,
      "Ice cream" -> 30,
      "Apple" -> 10)
    val afterDiscount = mapProducts.map(kv => (kv._1, kv._2*0.9))
    afterDiscount
  }
  // zadanie 6
  def printDiverseTuple(myTuple: (Int, String, Double)) : Unit = {
    myTuple.productIterator.foreach(x => {
      println(x)
    })
  }

}
