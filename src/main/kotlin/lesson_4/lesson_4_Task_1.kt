package lesson_4

fun main(){

    val reservedForToday = 13
    val reservedForTomorrow = 9

    val resultForToday = !(reservedForToday == NUMBER_OF_TABLES_SUMMARY)
    //println(resultForToday)
    val resultForTomorrow = !(reservedForTomorrow == NUMBER_OF_TABLES_SUMMARY)
    //println(resultForTomorrow)
    println("Доступность столиков на сегодня: $resultForToday  \nДоступность столиков на завтра: $resultForTomorrow")// "Доступность столиков на завтра: $resultForTomorrow" )
}

const val NUMBER_OF_TABLES_SUMMARY = 13
