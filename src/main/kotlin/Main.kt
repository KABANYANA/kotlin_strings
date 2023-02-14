//string concatination
fun main() {

    var Name = "Gloria"
    var location = "Kanombe"
    var sentence = Name + " lives in " + location
    println(sentence)

    //string indexing & inbuilt function
    var loc = "San Franciscoiii"
    println(loc[0])
    println(loc[6])
    println(loc[4])
    println(loc[12])
    println(loc.last())
    println(loc.first())
    println(loc.lastIndexOf("i"))

    //string interpolation using $

    val currency = "UGX"
    val item = "chicken"
    val amount = 20000

    val sente ="The price of a $item is $amount $currency"
    println(sente)

    //string comparison
    var place = "Mombasa"
    var place2 = "mombasa"
    println(place == place2)
    println(place.equals(place2))

    //string case
    var plac = "Mombasa"
    println(plac.uppercase())
    println(plac.lowercase())
    println(plac.capitalize())
    println(plac.decapitalize())
    println(plac.replaceFirst("M","m"))

    //empty & blank strings

    val k = ""
    val j = " "
    println(j.isEmpty())
    println(j.isBlank())

    //trimming spaces

    val fru = "avocado "
    println(fru.replace("avo","mango"))
println(printChars("Akirachix"))

checkName("joyeuse")
}
fun checkName(name: String) {
    val myName = "John"
    if (name == myName) {
        println("That's me!")
    } else {
        println("I don't know who that is")
    }
}

fun printChars(str: String) {
    val result = "${str[0]}${str[2]}${str[3]}"
    println(result)
}
