import kotlin.math.max

/*
1) Escrever o código que deve analisar três
números inteiros e retornar o maior deles
*/

fun main() {

    print("Digite o 1º número: ")
    val num1 = readLine()!!.toInt()

    print("Digite o 2º número: ")
    val num2 = readLine()!!.toInt()

    print("Digite o 3º número: ")
    val num3: Int = readLine()!!.toInt()

    val numMaior = max(
        max(num1, num2), num3
    )

    print("")
    print("O maior número entre eles é: $numMaior")

}
