
open class salvaVidas{val salva: String, val salva1: String){

    open fun(){


    println(" O que os salva vidas fazem ?")


    }



   class Profissao(salva: String, salva1: String ) : SalvaVidas( salva, salva1) {
     override fun acao(){

     println("O salva vidas $salva e $salva1 salvam vidas! ")

     }
}

}


fun main(){

val vida: SalvaVidas = Profissao (" Luiz"," Rodrigo")
    vida.acao()
}

