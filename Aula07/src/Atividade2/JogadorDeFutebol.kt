package Atividade2

class JogadorDeFutebol (val nome: String, var energia: Double, var alegria: Int, var gols: Int, var experiencia: Int) {

    fun fazerGol() {
        energia -=5
        alegria +=10
        gols +=1
        println("")
        print("GOOOOL!")
    }

    fun correr() {
        energia -=5
        println("")
        print("Cansei!")

    }
}