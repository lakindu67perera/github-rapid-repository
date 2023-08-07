object main extends App{
def addition(n: Int): Int = {
  if (n <= 0) {
    0
  } 
  else {
    val currentSum = if (n % 2 == 0) n else 0
    currentSum + addition(n - 1)
  }
}
println(addition(5))
}