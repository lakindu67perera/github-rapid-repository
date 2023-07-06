
object main extends App {
    def interest(x:Double): Double = {
        val rate=
            if (20000>x){
            0.02
            }
            else if(200000>x){
                0.04
            }
            else if(2000000>x){
                0.035
            }
            else {
                0.065
            }
        x*rate

    }

    //var amount = StdIn.readLine("Enter the diposited amount: ").toDouble;
    var amount = 50000
    var depinterest= interest(amount)
    println(depinterest)



}