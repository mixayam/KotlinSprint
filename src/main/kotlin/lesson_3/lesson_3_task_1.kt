package lesson_3

fun main(){
    val morningGreeting = "Good morning,"
    val eveningGreeting = "Good evening,"
    val userName = "User1"
    val Greeting ="""$morningGreeting $userName 
        |$eveningGreeting $userName
    """.trimMargin()
    println(Greeting)


}