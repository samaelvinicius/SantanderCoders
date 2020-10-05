package Exercicio1

fun main() {
    val contaPoupanca1 = ContaPoupanca(1010, 50.00, 5.00)
    val contaPoupanca2 = ContaPoupanca(1020, 40.00, 5.00)

    val contaCorrente1 = ContaCorrente(1030, 0.00, 5.00)
    val contaCorrente2 = ContaCorrente(1040, 0.00, 5.00)

    val relatorio = Relatorio()

    contaPoupanca1.depositar(5.00)
    contaPoupanca2.depositar(7.00)
    contaCorrente1.depositar(4.00)
    contaCorrente2.depositar(6.00)

    contaPoupanca1.sacar(10.00)
    contaPoupanca2.sacar(20.00)
    contaCorrente1.sacar(15.00)
    contaCorrente2.sacar(10.00)

    relatorio.gerarRelatorio(contaPoupanca1)
    relatorio.gerarRelatorio(contaPoupanca2)
    relatorio.gerarRelatorio(contaCorrente1)
    relatorio.gerarRelatorio(contaCorrente2)

}