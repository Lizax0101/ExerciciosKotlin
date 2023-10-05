open class SalvaVidas(val salva: String, val salva1: String) {

    open fun acao() {
        println("O que os salva vidas fazem?\nA salva vidas $salva e $salva1 salvam vidas!")
    }
}

class Profissao(salva: String, salva1: String ) : SalvaVidas(salva, salva1) {
    override fun acao() {
        println("O salva vidas $salva e $salva1 salvam vidas! ")
    }
}

fun main() {
    val vidas = SalvaVidas("Lizandra","Aline")
    vidas.acao()
    val profissao = Profissao("Luiz","Rodrigo")
    profissao.acao()
}
