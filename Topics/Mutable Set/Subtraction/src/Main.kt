fun solution(elements: Set<String>, element: String): MutableSet<String> {
    val set = mutableSetOf<String>()
    set.addAll(elements)
    set.remove(element)
    return set
}