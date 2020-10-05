package Ex01

fun main() {

    val bichos = ArrayList<String>()

    bichos.add("Pato")
    bichos.add("Cachorro")
    bichos.add("Gato")

    try {
        println(bichos[3])
    } catch (ex: Exception) {
        println(ex.message)
        ex.printStackTrace()
    }

}