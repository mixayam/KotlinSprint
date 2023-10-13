package lesson_4

fun main(){

    print("Благоприятные ли сейчас условия для роста бобовых? -")
    println((WEATHER_NOW == "солнечная")and(TENT_IS_OPEN == true)and(WET_LEVEL == 20)and(IS_IT_WINTER == false))
}
const val WEATHER_NOW : String = "солнечная"
const val TENT_IS_OPEN : Boolean = true
const val WET_LEVEL : Int = 20
const val IS_IT_WINTER : Boolean = true
