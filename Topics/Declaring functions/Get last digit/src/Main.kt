// write your code here

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}

fun getLastDigit(a: Int): Int {
    if (a > 0) return a % 10
    return a % 10 * -1
}
