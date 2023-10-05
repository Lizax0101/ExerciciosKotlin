//Dessa forma você acessa o metodo da Classe pai diretamente. 
open class SalvaVidas(val salva: String, val salva1: String) {

    open fun acao() {
        println("O que os salva vidas fazem?\nA salva vidas $salva e $salva1 salvam vidas!\n")

    }
}

class Profissao(salva: String, salva1: String ) : SalvaVidas(salva, salva1) {
    override fun acao() {
        println("O salva vidas $salva e $salva1 salvam vidas! \n")
        if (salva != salva1)
            println("Existe um problema $salva e $salva1 não são Salva vidas! \nE eu nem sei quem é $salva...")
    }
}

fun main() {
    val vidas = SalvaVidas("Lizandra","Aline")
    vidas.acao()
    val profissao = Profissao("Luiz","Rodrigo")
    profissao.acao()

    //Dessa forma você acessa o metodo da Classe pai diretamente.
    val salva = SalvaVidas("to na classe pai","Eu tambem")
        salva.acao()
}
