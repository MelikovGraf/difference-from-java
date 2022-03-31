fun main() {
    while (true) {
        print("Введите число лайков: ")
        val count = readln().toUInt(); if (count != 11u && count != 111u && count != 1111u && count % 10u == 1u) println("Нравится $count человеку")
        else println("Нравится $count людям")
    }
}
