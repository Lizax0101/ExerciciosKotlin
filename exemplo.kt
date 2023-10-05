class Exemplo(var nome:String, var idade: Int){
  fun mostrar() {
        println("Meu nome é: $nome e idade $idade")

   }

}

fun main(){
 val exemplo = Exemplo("Joao", 30 )
     exemplo.mostrar()
     
}
