object main extends App{
    def toUpper(name1: String): String={
        name1.toUpperCase()
    }
    def toLower(name2: String): String={ 
        name2.toLowerCase()
    }
    def formatNames(name: String, formatter: String => String): String = {
        formatter(name)
    }

    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    names.foreach { name =>
    val formattedName = formatNames(name, toUpper)
    println(formattedName)
    }
    names.foreach { name =>
    val formattedName = formatNames(name, toLower)
    println(formattedName)
    }
}
   