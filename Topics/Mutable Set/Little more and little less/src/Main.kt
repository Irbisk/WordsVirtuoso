fun solution(newSet: MutableSet<String>, oldSet: Set<String>): MutableSet<String> {
    oldSet.filter { it.startsWith('A') || it.startsWith('a') }.forEach { newSet.add(it) }
    return newSet
}