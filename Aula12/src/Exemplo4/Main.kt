package Exemplo4


fun main() {

    val pessoa1 = Pessoa("Felipe", Estado("PB", "Paraíba"))
    val pessoa2 = Pessoa("Gabriel", Estado("SP", "São Paulo"))
    val pessoa3 = Pessoa("Lanner", Estado("PB", "Paraíba"))

    val pessoas = listOf(pessoa1, pessoa2, pessoa3)

    println(pessoas.groupBy { it.estado.nome })

}