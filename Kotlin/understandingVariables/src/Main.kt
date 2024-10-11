//This time we will omit the args: Array<String>
fun main()
{
    var x: Int
    var name = "Allan"
    var surName = "Prado"
    val numbers = arrayOf(42, 24, 2000, 2024)

    x = numbers.size
    while (x-- > 0)
    {
        numbers[x]++
        numbers[x]++
        println(numbers[x])
        name += surName
        surName += name + numbers[x]
        println(name + surName + numbers[x])
    }

}