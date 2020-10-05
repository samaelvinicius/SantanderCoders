package Ex02

fun main () {

    print("Digite um número: ")
    var num = readLine()!!.toInt()

    if (num%2 == 0) {
        println("")
        print("Este número é par")
    } else {
        println("")
        print("Este número é ímpar")
    }

}