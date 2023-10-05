class Bandeira{

var cor = " "

var cor1= " "

var cor2 =" "

fun infoBand() {
         println(" $cor, $cor1, $cor2")
}

fun bandeiraBrasil(){
println("Essas sao as cores da brandeira do Brasil")

}

}
  fun mostraTodos(corA:String, corB: String, corC:String): Bandeira{

  val bandeira= Bandeira()
      bandeira.cor= corA
      bandeira.cor1= corB
      bandeira.cor2= corC
      return bandeira

  }

  fun main(){

  val mostrar = mostraTodos("verde", "amarelo", "azul")

  mostrar.infoBand()
mostrar.bandeiraBrasil()
    
  }
