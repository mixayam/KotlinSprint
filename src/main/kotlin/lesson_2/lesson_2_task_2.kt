package lesson_2

fun main(){
    val numOfWorkers = 50
    val salaryOfWorkers = 30000
    val numOfEmploees = 20
    val salaryOfEmployes = 20000
    val sumSalaryWorkers = numOfWorkers * salaryOfWorkers //расходы на зп постоянных
    val sumSalaryOfEmploees = numOfEmploees * salaryOfEmployes // расходы на зп стажеров
    val sumSalary = sumSalaryWorkers + sumSalaryOfEmploees //общие расходы по зп после прихода стажеров
    val midSalary = (sumSalaryWorkers + sumSalaryOfEmploees) / (numOfWorkers + numOfEmploees) //средняя зп одного сотрудника после прихода стажеров
    println(sumSalaryWorkers)
    println(sumSalary)
    println(midSalary)
}