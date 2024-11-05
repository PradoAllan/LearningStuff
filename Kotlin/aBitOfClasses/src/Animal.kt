//class Animal (val name: String, var height: Int, val color: String)
//{
//    fun bark()
//    {
//        println(if (this.height > 15) "WOOF WOOF" else "au au")
//    }
//}

class Dog (
    val name: String,
    val tutor: String,
    var height: Int,
    var age: Int,
    val color: String
)
{
    fun speak()
    {
        println(if (this.height >= 20) "WOOF WOOF" else "AU AU")
    }

    fun walk()
    {
        println("I'm walking with my tutor ${this.tutor}")
    }
}