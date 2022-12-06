fun main() {
    // put your code here
    var sum = 0
    var number = 0

    do {
        number = readln().toInt()
        sum += number
    } while (number != 0)

    println(sum)
}