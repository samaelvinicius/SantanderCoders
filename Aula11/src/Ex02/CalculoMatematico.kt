package Ex02

import java.lang.ArithmeticException

class CalculoMatematico {

    fun divisao (n1: Int, n2: Int): Int {

        if (n2 == 0) {
            throw ArithmeticException ("Não pode dividir por zero")
        } else {
            try {
                return n1 / n2
            }
            catch (ex: ArithmeticException) {
                println ("A operação não pode ser realizada")
                return 0
            }

        }
    }

}