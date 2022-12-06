fun main() {
    // put your code here
    val groupFirst = readln().toUInt()
    val groupSecond = readln().toUInt()
    val groupThird = readln().toUInt()
    val countDesks: UInt = groupFirst / 2u + groupFirst % 2u + groupSecond / 2u + groupSecond % 2u + groupThird / 2u + groupThird % 2u
    println(countDesks)
}