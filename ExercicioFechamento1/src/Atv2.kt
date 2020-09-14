/*
2) Escrever o código que deve analisar duas cadeias de texto e, caso
sejam diferentes, retornar true, ou, caso sejam iguais, retornar false
*/

fun main() {
    analise()
}

fun analise(): Boolean {

    print("Escreva seu 1º texto: ")
    val txt1 = readLine()!!.toString()

    print("Escreva seu 2º texto: ")
    val txt2 = readLine()!!.toString()

    return if (txt1 == txt2) {
        println("")
        print("As frases acima são iguais")
        false
    } else {
        println("")
        print("As frases acima são diferentes")
        true

    }
}