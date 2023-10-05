class Encomenda{
    var nPedido: Int= 0
    var nome: String = ""
    var opniao: String = ""
    var nomeP: String = ""

        fun saibaMais(){

            println("Para saber mais sobre seu pedido acesse o link: https://pedido.exemple.org")
    }
        fun rastreioPed(){
            println("Seu pedido foi postado $nome, Ás 22:00. Número do pedido: $nPedido!  \nE está a caminho! ")

        }
        fun avaliacaoPed(){
            println("Seu feedback: $opniao ")

    }
        fun infoGeral(){
            print("\nInformações gerais do pedido:")
            println("\nUsuario: $nome \nSeu pedido: $nomeP \nNúmero do Pedido: $nPedido \nSua avaliação: $opniao")

    }
}

fun infoPed(ped: Int, ped1:String,  ped2: String, ped3: String):Encomenda{

    var informacao = Encomenda()

        informacao.nPedido = ped
        informacao.nome = ped1
        informacao.nomeP = ped2
        informacao.opniao = ped3

        return informacao
}
fun main(){
    println("Central de consulta de pedidos!")

    print("Digite o numero do seu pedido aqui: ")
    val ped = readLine()?.toIntOrNull() ?: 0
    print("Digite seu nome: " )
    val ped1 = readLine() ?: ""
    print("Digite o nome do pedido: ")
    val ped2 = readLine() ?: ""
    print("Deixe sua opnião aqui: ")
    val ped3 = readLine()?:""

    val rastreio = infoPed(ped, ped1, ped2, ped3)
    val saibaMais = infoPed(ped, ped1, ped2, ped3)
    val avaliacao = infoPed(ped, ped1, ped2, ped3)
    val infoG = infoPed(ped, ped1, ped2, ped3)

        rastreio.rastreioPed()
        saibaMais.saibaMais()
        avaliacao.avaliacaoPed()
        infoG.infoGeral()

}
