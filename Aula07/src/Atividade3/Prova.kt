package Atividade3

class Prova (val dificuldade: Int, var energiaNecessaria: Int) {

    fun realizarProva(atleta: Atleta): Boolean {

        if (atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria) {
            atleta.energia -= energiaNecessaria
            println("O atleta realizou a prova")
            return true
        } else {
            println("Esse atleta não tem nível ou energia suficiente para fazer a prova")
            return false

        }
    }
}