package lesson_5

fun main() {

    var flagOne = 0
    var flagTwo = 0
    println("Введите число от 0 до 42:")
    var numberFromUserOne = readln().toInt()

    println("Введите число от 0 до 42:")
    var numberFromUserTwo = readln().toInt()

    if (numberFromUserOne == NUMBER_ONE || numberFromUserOne == NUMBER_TWO) {
        flagOne = +1
    } else flagOne = 0

    if (numberFromUserTwo == NUMBER_ONE || numberFromUserTwo == NUMBER_TWO) {
        flagTwo = +1
    } else flagTwo = 0

    when (flagOne + flagTwo) {
        1 -> println("Вы выиграли утешительный приз")
        2 -> println("Вы выиграли главный приз")
        else -> println("Неудача")
    }

    println("Были загаданы числа: $NUMBER_ONE и $NUMBER_TWO")

}

const val NUMBER_ONE = 10
const val NUMBER_TWO = 20