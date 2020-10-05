package Ex03

fun main(){

    print("Digite a taxa de imposto: ")
    val imposto = readLine()!!.toDouble()/100

    println("")
    print("Digite o custo do item: ")
    val custo = readLine()!!.toDouble()

    println("O valor total do item é:")
    println(somaImposto(imposto,custo))

}

fun somaImposto(taxaImposto:Double,custo:Double)= custo + custo*taxaImposto

