import org.jetbrains.annotations.Nullable

fun winner(user: String, machine: String)
{
    if (user == machine)
        println("It's a DRAW")
    else if (user == "rock")
    {
        if (machine == "paper")
            println("The computer WON!")
        else
            println("The user WON!")
    }
    else if (user == "paper")
    {
        if (machine == "scissor")
            println("The computer WON!")
        else
            println("The user WON!")
    }
    else if (user == "scissor")
    {
        if (machine == "rock")
            println("The computer WON!")
        else
            println("The user WON!")
    }
    else
        println("FINISHING GAME...")
}

fun getComputersChoice(array: Array<String>): String
{
    val arraySize = array.size
   //println(arraySize)
    return (array[(0..< arraySize).random()])
}

fun checkUserInput(input: String, array: Array<String>): Boolean
{
    var counter = 0

    if (input == "exit")
        return true
    for (value in array)
    {
        if (input == value)
            counter++
    }
    if (counter != 1)
        return (false)
    return (true)
}

fun main()
{
    var userInput: String? = null
    val choices = arrayOf("rock", "paper", "scissor")

    while (userInput != "exit")
    {
        userInput = readln().toString().lowercase()
        if (checkUserInput(userInput, choices))
            winner(userInput, getComputersChoice(choices))
        else
            println("WRONG INPUT...")
        //println(userInput)
        //println(getComputersChoice(choices))
    }
}