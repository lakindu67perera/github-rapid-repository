object main extends App{
    def toUpper(name1: String): String={
        name1.toUpperCase()
    }
    def toLower(name2: String): String={ 
        name2.toLowerCase()
    }
    def changeNames(name: String, change: String => String): String = {
        change(name)
    }

    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    names.foreach { name =>
    val changedName = changeNames(name, toUpper)
    println(changedName)
    }
    
}
   