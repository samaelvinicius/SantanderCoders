package Ex01

fun main () {

    print("Digite a nota do 1º bimestre: ")
    val n1 = readLine()!!.toDouble()

    println("")
    print("Digita a nota do 2º bimestre: ")
    val n2 = readLine()!!.toDouble()

    println("")
    print("Digita a nota do 3º bimestre: ")
    val n3 = readLine()!!.toDouble()

    println("")
    print("Digite a nota do 4º bimestre: ")
    val n4 = readLine()!!.toDouble()

    val media = (n1+n2+n3+n4)/4
    println("")
    print("A média das notas é: $media")


}