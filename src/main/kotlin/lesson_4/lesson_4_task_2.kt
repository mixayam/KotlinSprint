package lesson_4

fun main(){

    var cargoOneWeight = 20
    var cargoOneVolume = 80
    var cargoTwoWeight = 50
    var cargoTwoVolume = 100

    //var cargoOneAccordance = (AVERAGE_MIN_WEIGHT <= cargoOneWeight && cargoOneWeight <=AVERAGE_MAX_WEIGHT)&&(cargoOneVolume <= AVERAGE_VOLUME)
    print(("Груз весом $cargoOneWeight кг и объемом $cargoOneVolume л соответствует параметру Average: " ))
    println((AVERAGE_MIN_WEIGHT <= cargoOneWeight && cargoOneWeight <= AVERAGE_MAX_WEIGHT)&&(cargoOneVolume <= AVERAGE_VOLUME))

    print(("Груз весом $cargoTwoWeight кг и объемом $cargoTwoVolume л соответствует параметру Average: " ))
    println((AVERAGE_MIN_WEIGHT <= cargoTwoWeight && cargoTwoWeight <= AVERAGE_MAX_WEIGHT)&&(cargoTwoVolume <= AVERAGE_VOLUME))
}


const val AVERAGE_MIN_WEIGHT: Int = 35
const val AVERAGE_MAX_WEIGHT: Int = 100
const val AVERAGE_VOLUME: Int = 100