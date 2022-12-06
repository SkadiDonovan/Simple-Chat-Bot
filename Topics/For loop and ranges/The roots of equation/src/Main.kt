fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()
    val range = 0..1000

    for (x in range) {
        if (a * (x * x * x) + b * (x * x) + c * x + d == 0) println(x)
    }

}