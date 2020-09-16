
fun main() {
    var pessoa = Pessoa("Felipe")

    var cachorro2 = Cachorro("Farello", anoNasc = 2000)
    cachorro2.cor = "Branco"
    println(cachorro2.calculaIdade())

    var cachorro3 = Cachorro("Max")
    cachorro3.anoNasc = 2019
    println(cachorro3.calculaIdade())

}