package Atividade1

fun mais() {

    val cliente1 = Cliente("Giulia", "Machado")
    val cliente2 = Cliente("David", "Bonner")

    val conta1 = Conta(123, 20.0, cliente1)
    val conta2 = Conta(321, 10.0, cliente2)

    conta1.depositar(200.0)
    conta1.sacar(120.0) // Deve ficar com R$80

    conta2.sacar(200.0)
}