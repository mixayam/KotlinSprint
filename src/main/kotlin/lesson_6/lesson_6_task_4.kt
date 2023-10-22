package lesson_6
fun main() {
    var counter = 5

    while (counter > 0) {
        println("Угадайте число")
        val userNumber = readln().toInt()
        println("Осталось попыток ${counter--}")
        if (userNumber == NUMBER) {
            println("Это была великолепная игра!")
            return
        } else {
            println("неверно")
        }
    }
    println("Было загадано число $NUMBER")
}

const val NUMBER = 5