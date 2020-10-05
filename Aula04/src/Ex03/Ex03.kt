package Ex03

fun main () {

    print("Digite uma altura para descobrir o peso ideal: ")
    val altura = readLine()!!.toDouble()

    val pesoHomens = (72.7 * altura) - 58
    val pesoMulheres = (62.1 * altura) - 44.7

    println("")
    println("Peso ideal pra homens: $pesoHomens")
    println("Peso ideal pra mulheres: $pesoMulheres")

}