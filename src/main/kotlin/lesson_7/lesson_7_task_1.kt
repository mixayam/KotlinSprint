package lesson_7

fun main() {

    for (i in 'a'..'c') {
        print(i)
        for (k in 1..3 step 3) {
            print(k)
        }
    }
}