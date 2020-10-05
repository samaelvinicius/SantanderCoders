package Ex03

fun main () {

    print("Digite a 1ª nota: ")
    val n1 = readLine()!!.toDouble()

    println("")
    print("Digite a 2ª nota: ")
    val n2 = readLine()!!.toDouble()

    var media = (n1 + n2)/2

    val aprovacao = 7.0
    val distincao = 10.0

    if (media < aprovacao) {
        println("")
        print("Reprovado")
    }   else if (media == distincao) {
        println("")
        print("Aprovado com distinção")
    }   else {
        println("")
        print("Aprovado")
    }

}