package Exercicio1

class ContaPoupanca(conta: Int,
                    saldo: Double,
                    private val limite: Double): ContaBancaria(conta, saldo) {

    override fun sacar(quantia: Double) {
        if (quantia > (saldo + limite)) {
            println("Saldo insuficiente")

        } else {
            saldo -= quantia
        }
    }

    override fun depositar(quantia: Double) {
        saldo += quantia

    }
}