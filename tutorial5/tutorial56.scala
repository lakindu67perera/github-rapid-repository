object main extends App{
def fibonacci(n: Int): Unit = {
  def fibonaccigenerator(n: Int, a: Int, b: Int): Unit = {
    if (n > 0) {
      print(a + " ")
      fibonaccigenerator(n - 1, b, a + b)
    }
  }

  fibonaccigenerator(n, 0, 1)
}
fibonacci(5)
}