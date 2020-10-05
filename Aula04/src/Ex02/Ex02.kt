package Ex02

fun main () {

    print("Digite quanto vale sua hora: R$ ")
    val h1 = readLine()!!.toDouble()

    println("")
    print("Digite quantas horas você trabalha por mês: ")
    val h2 = readLine()!!.toDouble()

    val salario = h1 * h2

    println("")
    print("Você receberá R$ $salario")

}