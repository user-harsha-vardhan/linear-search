fun main() {

}
fun linearSearch (initial: IntArray, target: Int): Int {
    for (i in initial) {
        if (i == target)
            return i
    }
return -1
}
