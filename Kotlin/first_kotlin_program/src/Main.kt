//The main func arguments is the same as the argv in C.
//I'm saying that we receive an Array of Strings named "args"
//But, after kotlin 1.3, you no longer need to add the argv parameter. So, you can omit that
fun main(args: Array<String>) {
    /* var i: Int */
    val list = listOf("Allan", "Prado", "Rio", 42)
    val array = arrayOf("aprado", "o mais", "bonito")
    val arrayInt = arrayOf(1, 2, 3, 4, 5)

    println("SHOWING THE PARAMETERS PASSED TO MAIN FUNC:")
    showArrayStrings(args)
    println("Array of Strings: ")
    showArrayStrings(array)
    println("List of Any: ")
    showList(list)
    println("Array of Int: ")
    showArrayInt(arrayInt)

//    for (items in list)
//        printar_lista(items)
//    i = list.size
//    while (i-- > 0) {
//        println("-> valor do index $i ${list[i]}")
//    }
}

fun showList(s: List<Any>)
{
    for (items in s)
        println(items)
}

fun showArrayStrings(s: Array<String>)
{
//    for (items in s)
//        print(items+'\n')
    for (items in s)
        println(items)
}

fun showArrayInt(array: Array<Int>)
{
    //var i: Int = 0 Not a good way because of the type inference
    var i = 0
    val len = array.size
    while (i < len)
    {
        //print("${array[i]} ")
        println(if ((i % 2) == 0) "The number ${array[i]} is even" else "The number ${array[i]} is odd")
        /*
        if ((i % 2) == 0)
            "The number ${array[i]} is even"
        else
            "The number ${array[i]} is odd"
         */
        i++
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//fun main() {
//    val name = "Kotlin"
//    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//    // to see how IntelliJ IDEA suggests fixing it.
//    println("Hello, " + name + "!")
//
//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//    }
//}