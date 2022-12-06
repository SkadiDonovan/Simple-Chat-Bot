fun main() {
    // put your code here
    val firstN = readln().toInt()
    val secondN = readln().toInt()
    var sum = 0

    for (x in firstN..secondN) sum += x
    println(sum)
}