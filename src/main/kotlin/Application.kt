fun main(args: Array<String>) {
    val n1 = Integer.valueOf(args[0])
    val n2 = Integer.valueOf(args[1])
    println("Resultat ${add(n1, n2)}")
}

fun add(n1: Int, n2: Int) = n1 + n2