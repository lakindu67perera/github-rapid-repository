object main extends App{

    def isPrime(num: Int): Boolean = {
        if (num <= 1)
            false
        else if (num == 2)
            true
        else
            !(2 to (num - 1)).exists(x => num % x == 0)
    }

    def primeSeq(n: Int, current: Int = 2): Unit = {
        if (current < n) {
            if (isPrime(current))
                print(s"$current ")
            primeSeq(n, current + 1)
        }
    }
primeSeq(13)
}