class Encomenda{

var nPedido: Int= 0

var nome: String = ""

var opniao: String = ""


   fun saibaMais(){

println("Verifique tudo sobre sua compra: $nome, $nPedido, $opniao")


   fun historico(){




   }


   }


}

      fun infoPed(ped: Int, ped1:String,  ped2: String):Encomenda{

var informacao = Encomenda()

        informacao.nPedido = ped
        informacao.nome = ped1
        informacao.opniao = ped2
	return informacao
    


}
fun main(){



println("Central de consulta de pedidos")

print("Oba, digite o numero do seu pedido aqui: ")

val ped = readLine()?.toIntOrNull() ?: 0

print("Estamos chegando lá, Digite seu nome: ")

val ped1 = readLine()?:""

print("Deixe sua opnião aqui: ")

val ped2 = readLine()?:""


   infoPed(ped, ped1, ped2).saibaMais()
}




