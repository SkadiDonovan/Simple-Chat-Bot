fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val n = readln().toInt()

    if (b % n > 0) println(b / n - a / n) else println ((b - a) / n + 1)
}