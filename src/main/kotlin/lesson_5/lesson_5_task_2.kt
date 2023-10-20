package lesson_5

fun main(){

    val userBornYear = readln().toInt()
    val controlAge = CURRENT_YEAR - userBornYear
    if (controlAge >= AGE_OF_MAJORITY){
        println("Показать экран со скрытым контентом")
    }
    if (controlAge < AGE_OF_MAJORITY){
        println("Вернуться на главный экран")
    }
}
const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2023