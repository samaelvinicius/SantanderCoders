package Ex02

import java.lang.ArithmeticException

fun main () {

    val calculo = CalculoMatematico()

    try {
        calculo.divisao(4,0)
    }   catch (ex: ArithmeticException) {
        print(ex.message)
    }

}