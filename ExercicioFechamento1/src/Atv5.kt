/*
5) Escrever um código que deve analisar quatro números inteiros e,
caso numa seja maior que numC e numD ou caso numB seja maior que
numC e numD, retornar true, caso contrário, retornar false.
*/

fun main() {
    quatroNum()
}

fun quatroNum(): Any {

    print("Digite o 1º número inteiro: ")
    val numA = readLine()!!.toInt()

    print("Digite o 2º número inteiro: ")
    val numB = readLine()!!.toInt()

    print("Digite o 3º número inteiro: ")
    val numC = readLine()!!.toInt()

    print("Digite o 4º número inteiro: ")
    val numD = readLine()!!.toInt()

    return if (numA > numC && numA > numD && numB > numC && numB > numD) {
        println("")
        print("Os números A e B são maiores que os números C e D")
        true
    } else if (numB > numC && numB > numD) {
        println("")
        print("O número B é maior que os números C e D")
        true
    } else if (numA > numC && numA > numD) {
        println("")
        print("O número A é maior que os números C e D")
        true
    } else {
        println("")
        print("Os números A ou B não são maiores que os números C e D")
        false

    }
}