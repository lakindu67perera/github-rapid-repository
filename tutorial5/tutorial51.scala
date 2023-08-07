object main extends App{
    def prime(n:Int, denomenator:Int =2):Boolean = {
        if(n<=1){
            false
        }
        else if(n==denomenator) {
            true
        }

        else if(n% denomenator==0){
            false
        }
        else {
            prime(n,denomenator+1)
        }
    }
    println(prime(8))
}