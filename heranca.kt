//Classe base ( superclasse )

open class Animal(val nome: String, val idade: Int){

//metodo da class
  
  open fun fazemSom(){
        println("Os animais fazem sons")

   }

 }
 // Subclasse que vai herdar as propriedades da superclasse Animal
  class Cachorro( nome: String, idade: Int) : Animal(nome, idade){

// Sobreescrevendo o metodo fazemSom da Superclasse -POLIMORFISMO
     override fun fazemSom(){
        println("O cachorro late muito: Au Au")
   }

}

fun main(){

//Criando uma instancia da subclasse Cachorro

val cachorro = Cachorro("Ander", 9)
    println("Nome: ${cachorro.nome}" )
    println("Idade: ${cachorro.idade}" )

//Chamando o metodo fazemSom da subclasse
    cachorro.fazemSom()


}
