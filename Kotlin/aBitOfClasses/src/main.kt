import kotlin.properties.Delegates

//import Animal

fun main()
{
    lateinit var name: String

    name = "allan"
    println(name)

    val duck: Duck = Duck()
    duck.quack()

//    val song1 = Song("Lose yourself", "Eminem", 3.14)
//    val song2 = Song("The emptiness machine", "Linkin Park", 3.25)
//
//    song1.play()
//    song1.stop()
//    song1.showInformation()
//    song2.play()
//    song2.stop()
//    song2.showInformation()
//
//    val dog = Animal("Totó", 20, "Brown")
//    val dogTwo = Animal("Totózinho", 8, "White")
//
//    println("${dog.name}, ${dog.weight}, ${dog.color}")
//    dog.speak()
//    println("${dogTwo.name}, ${dogTwo.weight}, ${dogTwo.color}")
//    dogTwo.speak()
//
//    dog.walk()
//    dogTwo.walk()
}