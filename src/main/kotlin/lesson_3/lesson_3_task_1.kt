package lesson_3

import java.time.Clock
import java.time.LocalTime
import java.time.ZoneId

fun main(){
    val morningGreeting = "Good morning,"
    val eveningGreeting = "Good evening,"
    val userName = "User1"
    val time = LocalTime.now(Clock.system(ZoneId.systemDefault())).hour
    if(time <= 12) {
        println(morningGreeting + userName)
    } else {
        println(eveningGreeting + userName)
    }


}