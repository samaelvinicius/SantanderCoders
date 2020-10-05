package Exercicio1

class ContaCorrente (conta: Int,
                     saldo: Double,
                     private val taxaDeOperacao: Double): ContaBancaria(conta, saldo) {

    override fun sacar(quantia: Double) {
        val valorTotalDoSaque = quantia + taxaDeOperacao

        if (quantia > valorTotalDoSaque) {
            println("Saldo insuficiente")
        } else {
            saldo -= valorTotalDoSaque
        }
    }

    override fun depositar(quantia: Double) {

        if ((saldo + quantia) >= taxaDeOperacao ) {
            saldo += quantia - taxaDeOperacao
        }   else {
            print("Quantia insuficiente")
        }
    }

    override fun mostrarDados(){
        super.mostrarDados()

        println("Taxa de operação: $taxaDeOperacao")

    }
}