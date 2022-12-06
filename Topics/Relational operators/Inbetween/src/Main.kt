fun main() {
    // put your code here
    val firstNumber = readln().toInt() // 40
    val secondNumber = readln().toInt() // 30
    val thirdNumber = readln().toInt() // 50

    println((firstNumber >= secondNumber && firstNumber <= thirdNumber) || (firstNumber <= secondNumber && firstNumber >= thirdNumber))
}