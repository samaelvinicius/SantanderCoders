package Ex04

import kotlin.random.Random

fun main() {

    var num = 0
    var ponto = 0
    while (true) {

        val dado = rolar()
        if (dado == 0) {
            break
        }
        if (num == 0) {
            if (dado == 7 || dado == 11) {
                println("")
                print("Você tirou $dado! Parabéns você ganhou!!")
                break
            } else if ((dado == 2 || dado == 3 || dado == 12)) {
                println("")
                print("Você tirou $dado! Você perdeu =( ")
                break
            } else {
                ponto = dado
                println("")
                print("Você tirou $ponto! Você precisa tirar esse valor de novo.s")
            }

        } else if (dado == 7) {
            println("")
            print("Você tirou $dado! Você perdeu =( ")
            break
        } else if (ponto == dado) {
            println("")
            print("Parabéns você tirou $dado 2x! Você ganhou!")
            break
        } else {
            println("Você tirou $dado . Role de novo.")
        }
        num++
    }
}

fun rolar(): Int {
    print("Rolar dados (s ou n)? ")
    val rolar = readLine()!!.toLowerCase()
    if (rolar == "n") {
        return 0
    } else {
        return Random.nextInt(2, 12)
    }

}