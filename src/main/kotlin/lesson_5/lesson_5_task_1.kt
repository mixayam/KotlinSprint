package lesson_5

fun main (){

    val a = 5
    val b = 7
    val testNumber = a + b
    println("$a + $b = ?")
    val userResult = readln().toInt()

    if (userResult == testNumber){
        println("Добро пожаловать!")
    }else {
        println("Доступ запрещен.")
    }
}