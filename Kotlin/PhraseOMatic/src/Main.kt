fun main()
{
    val myArray = arrayOf(1, 2, 3, "test") // This way, the compiler accept any kind of data
    myArray[2] = "allan"

    //val myNewArray = arrayOf(1, 2, 3) // This way, the compiler infer that we have an Array of Int.
    //myNewArray[2] = "allan" // so, we can't assign a String type to an Array of Int

    val firstMatrix = arrayOf("Allan", "Prado", "da", "Silva")
    val secondMatrix = arrayOf("aprado", "42", "Rio")
    val thirdMatrix = arrayOf("Estou", "Codando", "PhraseOMatic")
    val sizeOfMatrix = Array<Int>(3) { firstMatrix.size; secondMatrix.size; thirdMatrix.size}
    val randomValues = Array<Int>(3) { (0..< sizeOfMatrix[0]).random();
        (0..< sizeOfMatrix[1]).random();
        (0..< sizeOfMatrix[2]).random()}

    println("sentence: ${firstMatrix[randomValues[0]]}${secondMatrix[randomValues[1]]}${thirdMatrix[randomValues[2]]}")

    for (value in randomValues)
        println(value)
}