 package wadale.apps.rockpaperscissors
fun main() {
for(outer in 1..3) println(outer)
    for (inner in 4 downTo 2) println(inner)
    val options = arrayOf("Rock","Paper","Scissors")
    val getGameChoice = getGameChoice(options)
    getUserChoice(options)
}
fun getGameChoice(optionsParams: Array<String>): Int { // a parameter function that accepts an array
    // get the game to pick an option
    return (Math.random() * optionsParams.size).toInt()
}
fun getUserChoice(optionsParams: Array<String>){
    println("Please choose an option: ")
    for(items in optionsParams)
    println("$items")
    val userInput = readLine()
    println(userInput)
    }

