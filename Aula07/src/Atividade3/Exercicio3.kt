package Atividade3

fun main() {

    val atleta1 = Atleta ("Eduardo", 2, 6.0)
    val atleta2 = Atleta ("Isaque", 3, 12.0)

    val prova1 = Prova (1, 1)
    val prova2 = Prova (2, 2)
    val prova3 = Prova (3, 3)

    println("")
    println(prova1.realizarProva(atleta1))
    println("")
    println(prova1.realizarProva(atleta2))
    println("")
    println(prova2.realizarProva(atleta1))
    println("")
    println(prova2.realizarProva(atleta2))
    println("")
    println(prova3.realizarProva(atleta1))
    println("")
    println(prova3.realizarProva(atleta2))

}