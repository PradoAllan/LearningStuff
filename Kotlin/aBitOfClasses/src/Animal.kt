//class Animal (val name: String, var height: Int, val color: String)
//{
//    fun bark()
//    {
//        println(if (this.height > 15) "WOOF WOOF" else "au au")
//    }
//}

//class Dog (
//    val name: String,
//    val tutor: String,
//    var height: Int,
//    var age: Int,
//    val color: String
//)
//{
//    fun speak()
//    {
//        println(if (this.height >= 20) "WOOF WOOF" else "AU AU")
//    }
//
//    fun walk()
//    {
//        println("I'm walking with my tutor ${this.tutor}")
//    }
//}

// OR YOU CAN DECLARE A CLASS LIKE THIS:
//In this way, you define the constructors params and then you assign the attributes.
class Animal(name: String, weight: Int, color: String) {
    val name = name
    var weight = weight
    val color = color.uppercase()
    val activities = arrayOf("Walks")

    //Initializer func
    init {
        println("Animal ${this.name} has been created...")
    }

    fun getWeight(): Int
    {
        return this.weight;
    }

    fun setWeight(weight: Int)
    {
        this.weight = weight
    }

    fun speak()
    {
        println(if (this.weight >= 20) "WOOF WOOF" else "AU AU")
    }
}