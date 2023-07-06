import java.lang.StringBuilder

fun findByIndex(names: Set<String>): String {
    return "${names.indexOf("Alice")}, ${names.indexOf("Victor")}"
}