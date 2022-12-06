fun main() {
    // write your code here
    val firstRange = readln().toInt()..readln().toInt()
    val secondRange = readln().toInt()..readln().toInt()
    val number = readln().toInt()

    println(number in firstRange && number in secondRange)
}