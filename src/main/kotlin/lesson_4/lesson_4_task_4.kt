package lesson_4

fun main(){

    var dayNumber = 5
    val exercisesHands = (dayNumber%2 != 0)
    val exercisesLegs = (dayNumber%2 == 0)
    val exercisesBack = (dayNumber%2 == 0)
    val exercisesPress = (dayNumber%2 != 0)

    println("""
        "Упражнения для рук:"    $exercisesHands
        "Упражнения для ног:"    $exercisesLegs
        "Упражнения для спины:"  $exercisesBack
        "Упражнения для пресса:" $exercisesPress
    """.trimIndent())

}
