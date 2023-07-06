

object main extends App {
    var input = scala.io.StdIn.readLine("Enter the integer: ").toInt
    println(input)
    if (input%2==0){
        println("You have entered an even number")
        if (input<=0){
            if (input==0){
                println("you have inputed zero")
            }
            else{
                println("You have inputed a negative number")
            }
    }
    }
    else {
        println(" You have entered a odd number")
        if (input<=0){
            if (input==0){
                println("you have inputed zero")
            }
            else{
                println("You have inputed a negative number")
            }
    }
    }

}