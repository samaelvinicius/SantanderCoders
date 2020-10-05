package Exemplo2

class Outlook: Email() {
    override fun enviar() {
        // enviar para o servidor outlook
        prepararEmail()

    }
}