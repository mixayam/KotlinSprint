package lesson_3

fun main(){
    val name = "Татьяна"
    val surname = "Андреева"
    val patronymic = "Сергеевна"
    val age = 20
    val surnameNew = "Сидорова"
    val ageNew = 22
    val fioAge = "$surname $name $patronymic, $age"
    val fioAgeNew = "$surnameNew $name $patronymic, $ageNew"
    println(fioAge)
    println(fioAgeNew)

}