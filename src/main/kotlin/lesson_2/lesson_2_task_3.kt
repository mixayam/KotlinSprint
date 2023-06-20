package lesson_2

fun main(){
    //Способ 1, подходит для данных в конкретной задаче
    val departureTimeHours = 9 //час отправления
    val departureTimeMins = 39 //минуты отправления
    val tripTimeMinsSum = 457 //сумма минут в пути
    val tripTimeHours = tripTimeMinsSum / 60 //часы в пути
    val arrivalTimeMinsSum  = departureTimeMins + tripTimeMinsSum
    val arrivalTimeHours = departureTimeHours + tripTimeHours
    val arrivalTimeMins = arrivalTimeMinsSum % 60


    /*val tripTimeMins = tripTimeMinsSum - (tripTimeHours * 60) //минуты в пути
    val arrivalTimeMins = (departureTimeMins + tripTimeMins) - 60 //минуты прибытия
    val arrivalTimeHours = departureTimeHours + tripTimeHours + 1 //часы прибытия*/



    println("$arrivalTimeHours:$arrivalTimeMins")
    //println(arrivalTimeMins)


    //Способ 2, подходит для любых значений времени
    /*if (arrivalTimeMins > 60){
        arrivalTimeMins = (departureTimeMins + tripTimeMins) - 60
        val arrivalTimeHours = departureTimeHours + tripTimeHours + 1
    }
     println("$arrivalTimeHours:$arrivalTimeMins")*/
}