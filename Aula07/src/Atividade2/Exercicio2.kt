package Atividade2

fun main() {

    val jogador1 = JogadorDeFutebol ("Izraias", 45.0, 60, 0, 170)
    val jogador2 = JogadorDeFutebol ("Jonathan", 70.0, 50, 0, 195)

    SessaoDeTreinamento(10).treinarA(jogador1)
    SessaoDeTreinamento(10).treinarA(jogador2)

}