fun main(args: Array<String>) {
    //конкатенация строк - сложение сьрок с помощью знака +

    val gree = "Здравствуйте"

    //интерполяция строк - переменная вписывается в строку, перед переменной нужно пославить $ перед перменной
    println("$gree! Какой будет ваш главный вопрос?")
    println("На который можно ответить ${40+1}")

    //многострочная запись
    val multiString = """
        |string1
           |string2
      |string3
    """.trimMargin()
    println(multiString)


}