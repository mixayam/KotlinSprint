package lesson_6

fun main() {
    println("Сколько секунд требуется засечь?")
    var counter = readln().toInt()

    while (counter > 0) {
        println("Осталось секунд: ${counter--} ")
        Thread.sleep(1000)
    }
    println("Время вышло")
}