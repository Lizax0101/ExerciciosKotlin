class Encomenda{
    var nPedido: Int= 0
    var nome: String = ""
    var opniao: String = ""
    var produto:String = ""
        fun saibaMais(){

            println("Para saber mais sobre seu pedido acesse o link: https://pedido.exemple.org")
    }
        fun rastreioPed(){
            println("Seu pedido foi postado $nome, Ás 22:00. Número do pedido: $nPedido!  \nE está a caminho! ")

     }

	fun produtoPed(){
	    println("Seu $produto sera entregue até 30 de setembro")

   }
        fun avaliacaoPed(){
        println("Seu feedback: $opniao ")

    }
}

fun infoPed(ped: Int, ped1:String,  ped2: String, ped3: String):Encomenda{

    var informacao = Encomenda()

        informacao.nPedido = ped
        informacao.nome = ped1
        informacao.opniao = ped2
	informacao.produto =ped3
        return informacao
}
fun main(){
    println("Central de consulta de pedidos!")

    print("Digite o numero do seu pedido aqui: ")
    val ped = readLine()?.toIntOrNull() ?: 0

    print("Digite o nome do seu produto: ")
    val ped3 = readLine() ?: ""

    print("Digite seu nome: " )
        val ped1 = readLine() ?: ""

    print("Deixe sua opnião aqui: ")
    val ped2 = readLine()?:""

    infoPed(ped, ped1, ped2, ped3).rastreioPed()
    infoPed(ped, ped1, ped2, ped3).produtoPed()
    infoPed(ped, ped1, ped2, ped3).saibaMais()
    infoPed(ped, ped1, ped2, ped3).avaliacaoPed()

}
