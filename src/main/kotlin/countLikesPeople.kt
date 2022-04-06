fun main() {
    while (true) {
        print("Введите число лайков: ")
        val count = readln().toInt()
        val string = if (
            count % 10 == 11
            || count % 10 == 1
        ) "Нравится $count человеку"
        else "Нравится $count людям"
        println(string)
    }
}
