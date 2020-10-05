package Exercicio1

abstract class ContaBancaria (protected val conta: Int, protected var saldo: Double): Imprimivel {

    abstract fun sacar(quantia: Double): Boolean
    abstract fun depositar(quantia: Double): Boolean

    override fun mostrarDados () {
        println("Conta: $conta")
        println("Saldo: R$ $saldo")

    }

    fun transferir(quantia: Double, destino: ContaBancaria) {
        val saldoContaOrigem = saldo

        if (sacar(quantia) || destino.depositar(quantia)) {
            saldo = saldoContaOrigem
            println("Não foi possivel realizar a transferencia")
        } else {
            println("Transferência realizada")
        }
    }
    fun obterConta(): Int = conta

}