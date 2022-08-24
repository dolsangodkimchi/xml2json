import org.json.XML

fun main() {
    val stdin = generateSequence(::readLine).toList().joinToString("\n")
    val json = XML.toJSONObject(stdin)
    println(json)
}