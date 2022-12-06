fun main() {
    // put your code here
    val data = readln().split(" ")
    val firstName = data[0]
    val lastName = data[1]
    val age = data[2]

    println("${firstName.first()}. $lastName, $age years old")
}