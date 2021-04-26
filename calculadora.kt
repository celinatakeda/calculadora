import kotlin.math.pow

fun main() {

    println ("Opção 1: Soma")
    println ("Opção 2: Subtração")
    println ("Opção 3: Multiplicação")
    println ("Opção 4: Divisão")
    println ("Opção 5: Porcentagem")
    println ("Opção 6: Fatorial")
    println ("Opção 7: Potenciação")

    print ("Escolha opcção: ")

    val opcao = readLine() !!.toIntOrNull()
    if (opcao == null) {
        println ("Erro! Opção nulo não é aceito!")
    }
    if (opcao == 1 || opcao==2 || opcao==3 || opcao==4 || opcao==5 ){
        println ("Entre com os valores ")
        val v1 = readLine() !! .toFloatOrNull()
        if (v1 == null ) {
            println("Erro! Valor nulo não é aceito!")
        }else {
            val v2 = readLine() !! .toFloatOrNull()
            if (v2==null) {
                println ("Erro! Valor nulo não é aceito!")
            } else
                when (opcao) {
                    1 -> soma(v1, v2)
                    2 -> subtracao(v1, v2)
                    3 -> multiplicacao(v1, v2)
                    4 -> divisao(v1, v2)
                    5 -> porcentagem(v1, v2)
                }
        } } else
        when (opcao) {
            6 -> fatorial()
            7 -> potenciacao()
        }
}

fun soma (a1:Float,a2:Float){
    val s=a1.plus(a2)
    print ("A soma é: "+ s)
}

fun subtracao (a1:Float,a2:Float){
    val s=a1.minus(a2)
    print ("A subtração é: " + s)
}
fun multiplicacao(a1:Float,a2:Float){
    val m=a1.times(a2)
    print (" A multiplicação é: " + m)
}
fun divisao (a1:Float,a2:Float){
    val d=a1.div(a2)
    print ("A divisão é: "+d)
}

fun porcentagem (a1:Float,a2:Float){
    val p=a1.times(a2.div(100))
    print ("A porcentagem é: "+p)
}

fun fatorial (){
    println ("Entre com valor a ser fatorado: ")
    var fat:Long = readLine()!!.toLong()
    for (i in 1..fat) {
        fat *= i  //fatorial = fatorial * i;
    }
    println ("Fatorial é: "+fat)
}

fun potenciacao () {
    println ("Entre com a base: ")
    val vb: Double = readLine()!!.toDouble()
    println ("Entre com a expoente: ")
    val exp: Double = readLine()!!.toDouble()

    val p:Double = vb.pow(exp)
    println ("Potenciação é: "+ p)
}