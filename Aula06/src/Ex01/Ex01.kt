package Ex01

fun main () {

    print("1º Argumento: ")
    val arg1 = readLine()!!.toDouble()

    println("")
    print("2º Argumento: ")
    val arg2 = readLine()!!.toDouble()

    println("")
    print("3º Argumento: ")
    val arg3 = readLine()!!.toDouble()

    var soma = arg1+arg2+arg3

    println("Soma dos argumentos: $soma")

}