fun main() {
    while (true) {
        print("Введите число лайков: ")
        val count = readln().toInt()
        val string = if (
            count != 11
            && count % 10 == 1
            && count % 100 != 11
            && count % 1000 != 11
            && count % 10000 != 11
        ) "Нравится $count человеку"
        else "Нравится $count людям"
            println(string)
    }
}
