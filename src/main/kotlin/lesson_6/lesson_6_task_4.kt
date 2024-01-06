package lesson_6

fun main() {
    var counter = NUMBER

    while (counter > 0) {
           println("Угадайте число")
           val userNumber = readln().toInt()
           if (userNumber == NUMBER) {
           println("Это была великолепная игра!")
               return
           } else {
               println("неверно")
               println("Осталось попыток ${counter--}")
           }
       }
        println("Было загадано число $NUMBER")

}
const val NUMBER = 5