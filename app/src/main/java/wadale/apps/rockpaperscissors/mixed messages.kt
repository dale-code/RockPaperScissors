package wadale.apps.rockpaperscissors

fun main(){ // i don't understand this code yet!!!!!!!!!!!!
var x = 0
    var y = 20
    for(outer in 1..3){
        for (inner in 4 downTo 2){
            x += 6
            y++
            x += 3
        }
        y -= 2
    }
    println("$x $y")
}