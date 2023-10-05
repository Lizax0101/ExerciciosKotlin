class Teste{

var nome = " "

var idade = 0

fun infoPessoal(){

println(" Meu nome é $nome e tenho $idade anos")

}

}
     fun recebeNomeIdade(): Pair<String, Int>{

     print("Escreva seu nome: ")

     val nome = readlnOrNull() ?:""

     print("Escreva sua idade: ")

     val idade = readlnOrNull()?.toIntOrNull() ?: 0
         return Pair( nome, idade)

}

   fun main(){

   

   val (recebeNome, recebeIdade) = recebeNomeIdade()
        

   val instanciaTeste = Teste()
instanciaTeste.nome = recebeNome
instanciaTeste.idade =  recebeIdade
instanciaTeste.infoPessoal()
}

