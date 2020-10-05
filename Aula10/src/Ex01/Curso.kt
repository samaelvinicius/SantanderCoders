package Ex01

class Curso (var nome: String, var prof: Professor) {

    val aula get() = ArrayList<Aula>()
    val aluno get() = ArrayList<Aluno>()

}