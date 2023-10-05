interface Modelo{
fun MetodoModelo():Unit

        }

fun Modelo.MetodoInterface(){
      println(" Oi, sou um metodo na interface")


      }
class PrimeiraClasse:Modelo{
    override fun MetodoModelo(){
      println("Olá, sou o metodo da Primeira Classe")
 
  }

}
fun main(){
 
  val instancia = PrimeiraClasse()
      instancia.MetodoModelo()
      instancia.MetodoInterface()

 }


