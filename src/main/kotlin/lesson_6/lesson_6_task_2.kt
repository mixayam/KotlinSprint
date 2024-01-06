package lesson_6

fun main() {
    println("Сколько секунд требуется засечь?")
    val userSeconds = readln().toLong()

    Thread.sleep(userSeconds * 1000)

    println("Прошло $userSeconds секунд")
}