const val MIN_CUPS = 10
const val MAX_CUPS = 20
const val MIN_CUPS_WEEKEND = 15
const val MAX_CUPS_WEEKEND = 25

fun main() {
    // write your code here
    val countCups = readln().toInt()
    val weekend = readln().toBoolean()

    println(countCups in MIN_CUPS..MAX_CUPS && !weekend || countCups in MIN_CUPS_WEEKEND..MAX_CUPS_WEEKEND && weekend)
}