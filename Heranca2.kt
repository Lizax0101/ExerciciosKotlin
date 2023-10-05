open class Planetas(nome: String, nome1: String, distancia: Int) {
  init {
    println(" Existem 8 planetas no sistema solar, a $nome e $nome1 são alguns deles. ")

  }

}

class Terra(nome: String, nome1: String, distancia: Int) : Planetas(nome, nome1, distancia) {
 init {
   println("A distancia entre $nome e $nome1 é de $distancia milhões de quilometros.")

   }
 init {Em seu ponto mais longe  da $nome a, esse espaço é de aproximadamente 965 milhões de km de distância.}


}

fun main(){

val terra2 = Terra("Terra", "Jupiter", 590 )



}
