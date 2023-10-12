package lesson_4

fun main() {

    val isFreeToday = 13
    val isFreeTomorrow = 9

    val resultForToday = isFreeToday != NUMBER_OF_TABLES_SUMMARY

    val resultForTomorrow = isFreeTomorrow != NUMBER_OF_TABLES_SUMMARY

    println("Доступность столиков на сегодня: $resultForToday  \nДоступность столиков на завтра: $resultForTomorrow")
}
const val NUMBER_OF_TABLES_SUMMARY = 13
