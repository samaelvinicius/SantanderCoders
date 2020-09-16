package Atividade2

class SessaoDeTreinamento (var experiencia: Int) {

    fun treinarA(jogador: JogadorDeFutebol) {
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        println("")
        println("")
        println("Experiência inicial do ${jogador.nome}: ${jogador.experiencia}")
        jogador.experiencia +=5
        println("Experiência final do ${jogador.nome}: ${jogador.experiencia}")

    }
}