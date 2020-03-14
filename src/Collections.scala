object ProductsMap {

  def main(args: Array[String]) {
    val mapProducts = Map("Chocolate" -> 20,
      "Ice cream" -> 30,
      "Apple" -> 10)
    val afterDiscount = mapProducts.map(kv => (kv._1, kv._2*0.9))
    println("New map after discount: " + afterDiscount)
  }

}
