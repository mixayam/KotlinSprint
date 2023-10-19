package lesson_4
fun main(){

    var dayNumber = 5
    var parity = dayNumber%2

    val exrcisesHands = (parity != 0)
    val exercisesPress = exrcisesHands
    val exercisesLegs = (parity == 0)
    val exercisesBack = exercisesLegs

    println("""
        "Упражнения для рук:    $exrcisesHands
        "Упражнения для ног:    $exercisesLegs   
        "Упражнения для спины:  $exercisesBack
        "Упражнения для пресса: $exercisesPress 
    """.trimIndent())

}
