object main extends App{
def isEven(n: Int): Boolean = {
  if (n == 0) {
    true
  } else if (n == 1) {
    false
  } else {
    isEven(n - 2)
  }
}
println(isEven(0))
}