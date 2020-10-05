package Ex01

fun main () {

    print("Digite F ou M: ")
    val sexo = readLine()!!.toString()

    if (sexo == "M") {
        println("")
        print("M - Masculino")
    }   else if (sexo == "F") {
        println("")
        print("F - Feminino")
    }   else {
        println("")
        print("Sexo inválido")
    }

}