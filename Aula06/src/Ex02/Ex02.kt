package Ex02

fun main () {

    print("Digite um argumento: ")
    val arg = readLine()!!.toDouble()

    if (arg <= 0) {
        return println("N")
    } else {
        return print("P")
    }


}
