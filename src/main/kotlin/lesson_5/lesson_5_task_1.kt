package lesson_5

fun main (){

    val testNumber = 10
    val userResult = readLine()!!.toInt()

    if (userResult == testNumber){
        println("Добро пожаловать!")
    }else{
        println("Доступ запрещен.")
    }
}