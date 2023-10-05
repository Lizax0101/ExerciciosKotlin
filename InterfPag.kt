//Código: exemplo de interface em Kotlin #Interface

interface MetodoPagamento{
    fun processarPagamento(valor: Double)
}
class CartaoCredito: MetodoPagamento{

    override fun processarPagamento(valor: Double) {
        println("Pagamento de ${Formatar.formatarvalor(valor)} realizado com cartão de crédito.")
    }
}

class Paypal:MetodoPagamento{
    override fun processarPagamento(valor: Double) {
        println("Pagamento ${Formatar.formatarvalor(valor)} realizado via Paypal.")
    }
}

class TransferenciaBancaria:MetodoPagamento{
    override fun processarPagamento(valor: Double) {
        println("Pagamento ${Formatar.formatarvalor(valor)} realizado via transferência bancaria.")

    }

}
class Formatar{
    companion object{
        fun formatarvalor(valor:Double): String{
            return String.format("R$%.2f", valor)
        }
    }
}

fun main(){

    val cartao = CartaoCredito()
    val paypal = Paypal()
    val transferencia = TransferenciaBancaria()
    cartao.processarPagamento(100.00)
    paypal.processarPagamento(50.00)
    transferencia.processarPagamento(75.00)
}
