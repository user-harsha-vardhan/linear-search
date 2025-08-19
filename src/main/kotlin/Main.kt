fun main() {
    val list = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    println("enter number to search in the list:")
    val input = readln().toInt()
    val result = linearSearch(list, input)

}

fun linearSearch(initial: IntArray, target: Int): Int {
    for (i in initial.indices) {
        if (i == target)
            return i
    }
    return -1
}
