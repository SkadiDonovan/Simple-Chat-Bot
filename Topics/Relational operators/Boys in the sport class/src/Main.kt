fun main() {
    // put your code here
    val arrangeFirstBoy = readln().toInt()
    val arrangeSecondBoy = readln().toInt()
    val arrangeThirdBoy = readln().toInt()

    val testOne = arrangeSecondBoy in arrangeFirstBoy..arrangeThirdBoy
    val testTwo = arrangeSecondBoy in arrangeThirdBoy..arrangeFirstBoy

    println(testOne || testTwo)
}