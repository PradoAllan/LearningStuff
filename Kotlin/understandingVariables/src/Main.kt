//This time we will omit the args: Array<String>
fun main()
{
    var x: Int
    var test = 24
    var name = "Allan"
    var surName = "Prado"
    val primitiveArray = intArrayOf(42, 24, 2000, 2024)
    val nonPrimitiveArray = arrayOf(42, 24, "2000", "aprado")

    x = primitiveArray.size
    while (x-- > 0)
    {
        println(primitiveArray[x].javaClass)
        println(primitiveArray[x])
        if (primitiveArray[x].equals(test))
            println("The value of array[$x] is ${primitiveArray[x]} and is = to the test varible $test")

        //name += surName
        //surName += name + numbers[x]
        //println(name + surName + numbers[x])
    }

    x = nonPrimitiveArray.size
    while (x-- > 0)
    {
        println(nonPrimitiveArray[x].javaClass)
        println(nonPrimitiveArray[x])
    }
    for (a in nonPrimitiveArray)
    {
        println(a.javaClass)
        println(a)
    }

}