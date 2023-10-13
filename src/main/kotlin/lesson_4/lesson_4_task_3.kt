package lesson_4

fun main(){

    val weather:String = "солнечная"
    val tentIsOpen:Boolean = true
    val wetLevel:Int = 20
    val IsItWinter:Boolean = true

    print("Благоприятные ли сейчас условия для роста бобовых? -")
    println((weather == "солнечная")and(tentIsOpen == true)and(wetLevel == 20)and(IsItWinter == false))
}
