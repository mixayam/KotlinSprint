package lesson_4
fun main(){

    var dayNumber = 6
    var parity = dayNumber % 2

    println("""
        "Упражнения для рук:    ${ parity != 0}
        "Упражнения для ног:    ${ parity == 0}
        "Упражнения для спины:  ${ parity == 0}
        "Упражнения для пресса: ${ parity != 0}
    """.trimIndent())

}
