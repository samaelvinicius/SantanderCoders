open class Animal (var raca: String) {
    var idade = 0

    constructor(raca: String, idade: Int): this(raca) {
        this.idade = idade
    }

    constructor(idade: Int) {
        this.idade = idade
    }

    fun comer() {

    }
}