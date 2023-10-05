class Planeta{

var nome:String = "Saturno"

var idade: Int = 1000

 fun Detalhes(){
     println(" $nome é meu planeta favorito, ele tem $idade anos de existencia")


 }
}
 
 fun main(){

val plan = Planeta()

    plan.nome
    plan.idade
    println(" Meu nome é ${plan.nome}, eu tenho ${plan.idade} anos")
    
    plan.Detalhes()
    plan.nome ="Mercurio"
    plan.idade = 3000
    println(" Esse é ${plan.nome} ele tem ${plan.idade} anos")
    
    plan.Detalhes()

 }


