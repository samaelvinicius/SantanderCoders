
class Cachorro (val nome: String, ) {

    var cor: String = ""
    var anoNasc: Int = 0

    constructor(nomeDoCachorro: String, anoNasc: Int): this(nomeDoCachorro) {
        this.anoNasc = anoNasc
    }

    fun calculaIdade(): Int {
        return 2020 - anoNasc
    }
}