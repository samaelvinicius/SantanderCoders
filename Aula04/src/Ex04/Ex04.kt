package Ex04

fun main () {

    print("Digite o peso dos peixes: ")
    val peso = readLine()!!.toInt()
    var excesso = 0.0

    if (peso > 50) {
        excesso = (peso - 50).toDouble()
    }

    val multa = 4 * excesso

    println("")
    println("Excedeu $excesso KGs")
    println("O valor a ser pago é de R$ $multa")

}