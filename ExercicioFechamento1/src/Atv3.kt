/*
3) Escrever o código que deve analisar um número inteiro e,
caso ele seja par, retornar true, caso contrário, retorna false
*/

fun main() {
    parouimpar()
}

fun parouimpar(): Boolean {

    print("Digite um número para verificar se é par ou ímpar: ")
    val numero = readLine()!!.toInt()

    return if (numero % 2 == 0) {
        println("")
        print("O número é par")
        true
    } else {
        println("")
        print("O número é ímpar")
        false

    }
}
