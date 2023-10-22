package lesson_6

fun main() {
    do {
        println("Придумайте логин")
        val userLoginNew = readln().toString()
        println("Придумайте пароль")
        val userPasswordNew = readln().toString()

        println("Логин:")
        val userLogin = readln().toString()
        println("Пароль:")
        val userPassword = readln().toString()
    } while (userLogin != userLoginNew && userPassword != userPasswordNew)

    println("Авторизация прошла успешно")

}