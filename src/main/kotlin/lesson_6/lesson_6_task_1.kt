package lesson_6

fun main() {
    println("Придумайте логин")
    var UserLoginNew = readln().toString()
    println("Придумайте пароль")
    var UserPasswordNew = readln().toString()

    println("Логин:")
    var UserLogin = readln().toString()
    println("Пароль:")
    var UserPassword = readln().toString()

    if (UserLogin != UserLoginNew && UserPassword != UserPasswordNew) {
        do {
            println("Придумайте логин")
            var UserLoginNew = readln().toString()
            println("Придумайте пароль")
            var UserPasswordNew = readln().toString()

            println("Логин:")
            var UserLogin = readln().toString()
            println("Пароль:")
            var UserPassword = readln().toString()
        } while (UserLogin == UserLoginNew && UserPassword == UserPasswordNew)
    } else {
        println("Авторизация прошла успешно")
    }
}