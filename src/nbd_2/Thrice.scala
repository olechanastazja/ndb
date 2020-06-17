package nbd_2

object Thrice {
  def main(args: Array[String]) {
    def foo(n: Int) = 5 * n + 2
    println(doTrice(foo, 2))
  }

  def doTrice(f: Int => Int, n:Int): Int = f(f(f(n)))
}
