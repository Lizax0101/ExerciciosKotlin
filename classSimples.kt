class Carro {
    var nome = ""
    var ano = 0
    var ligar = ""
    fun infoCar() {
        println("Nome: $nome, ano: $ano ")
    }
    fun ligar() {
        return if (ligar != "s")
        println("\nVocê escolheu não ligar o $nome")
        else{
            println("\nVocê ligou seu $nome Vrummm")
        }
    }
}
    fun carOBJ(nome: String, ano: Int, ligar: String):Carro{
        val carro = Carro()
            carro.nome = nome
            carro.ano = ano
            carro.ligar = ligar
            return carro
    }
 fun main(){
     print("Digite o nome do carro: ")
     val nome1 = readLine() ?: ""
     print("Digite o ano: ")
     val ano1 = readLine()?.toIntOrNull() ?: 0
     print("Deseja ligar seu carro: ? (s/n)")
     val ligar1 = readLine() ?: ""

     carOBJ(nome1, ano1, ligar1).infoCar()
     carOBJ(nome1, ano1, ligar1).ligar()
 }
