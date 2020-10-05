package Exercicio1

class Banco: Imprimivel {

    var contasBancarias = ArrayList<ContaBancaria>()

    fun inserir(novaConta:ContaBancaria) {
        var posicao = procurarConta(contaInativa.numeroDeConta)
        if(posicao == null) return print("Conta não encontrada")
        contasBancarias.removeAt(posicao)
    }

    fun procurarConta(contaProcurada: Int): Int? {
        for(index in 0..contasBancarias.size) {
            if(contaProcurada == contasBancarias[index].numeroDeConta) return index
        }
        return null
    }

    override fun mostrarDados() {
        for(1 in 0..contasBancarias.size) {
            contasBancarias[i].mostrarDados()
        }
    }
}