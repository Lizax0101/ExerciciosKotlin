open class Brasil(var nome: String = "São Bernardo", var nome1: String = "Osasco") {

     open fun estados() {
println("São Paulo é o maior estado do Brasil, $nome e $nome1 são cidades deste estado.")
  
  }

 }
    class Habitantes:Brasil() {
 override fun estados() {
println(" Em São Paulo existem cerca de 11 milhões de habitantes segundo IBGE")

   }

 }
fun main() {

 val brasil:  Brasil = Habitantes()
 val brasil1 = Brasil()
     brasil1.estados()
     brasil.estados()

 }


 //O motivo pelo qual val brasil: Brasil = Habitantes() é possível é devido à natureza de polimorfismo das classes e funções em Kotlin.
//A variável brasil é do tipo Brasil, mas pode referenciar uma instância de Habitantes() porque Habitantes é uma subclasse de Brasil. 
//Isso significa que, em tempo de execução, o método chamado será aquele que é definido na classe do objeto real (neste caso, Habitantes).
//Isso é conhecido como ligação dinâmica  

//EXPLICACAO
