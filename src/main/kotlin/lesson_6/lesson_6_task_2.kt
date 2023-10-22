package lesson_6

fun main() {
    println("Сколько секунд требуется засечь?")
    val userSeconds = readln().toInt()
    var counter = userSeconds

    do {
        counter--
        Thread.sleep(1000)
    } while (counter > 0)
    println("Прошло $userSeconds секунд")
}