package lesson_5

fun main() {

    println("Введите имя пользователя")

    var enteredUsername = readln().toString()

    if (enteredUsername == USERNAME) {
        println("Введите пароль:")
    } else {
        println("Пожалуйста, зарегестрируйтесь.")
        return
    }

    var enteredPassword = readln().toString()

    if (enteredPassword == PASSWORD) {
        println("Добро пожаловать!")
    }
}

const val USERNAME: String = "Zaphod"
const val PASSWORD: String = "PanGalactic"