interface Operacao{

fun calcular( num1:Int, num2: Int): Int
  
  }

class Soma: Operacao{
   override fun calcular(num1: Int, num2:Int):Int {

          return num1 + num2
      }
  }

class Subtracao: Operacao{
  override fun calcular( num1: Int,num2: Int): Int {
     return num1 - num2

    }



}

fun main(){

// val soma = Soma()
// val subtracao = Subtracao()
// val somarAmbos = soma.calcular( 75, 5)
// val subtracao = subtração.calcular(15, 2)

val soma: Operacao = Soma()
val subtracao: Operacao = Subtracao()

println(" O resultado da soma entre num1 e num2 é: ${soma.calcular(10, 5)}")
println(" O resultado da subtração presente é: ${subtracao.calcular(15, 2)}")
    
}


