package lesson_5

fun main() {

    println("Введите число от 0 до 42:")
    val numberFromUserOne = readln().toInt()

    println("Введите число от 0 до 42:")
    val numberFromUserTwo = readln().toInt()

    val isFirstCondition = if (numberFromUserOne == NUMBER_ONE || numberFromUserOne == NUMBER_TWO) {
        true
    } else {
        false
    }

    val isSecondCondition = if (numberFromUserTwo == NUMBER_ONE || numberFromUserTwo == NUMBER_TWO) {
        true
    } else {
        false
    }

    when {
        isFirstCondition && isSecondCondition -> println("Вы выиграли главный приз")
        isFirstCondition || isSecondCondition -> println("Вы выиграли утешительный приз")
        else -> println("Неудача")
    }

    println("Были загаданы числа: $NUMBER_ONE и $NUMBER_TWO")

}

const val NUMBER_ONE = 10
const val NUMBER_TWO = 20