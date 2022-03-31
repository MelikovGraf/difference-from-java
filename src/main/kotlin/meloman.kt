const val THOUSAND = 1000
const val TEN_THOUSAND = 10000
const val FIRST_COUPON = 100
const val THIRD_COUPON = .99
const val SECOND_COUPON = .95

fun main() {

    while (true) {
        print("Введите сумму покупки: ")
        var amount = readln().toDouble()
        print("Введите цифру 1, если вы в первый раз: ")
        val user = readln().toInt()
        if (user == 1)
            println("Сумма к оплате с учетом скидки: ${pay(amount)} рублей ${payCent(amount)} копеек")
        else
            println("Сумма к оплате с учетом скидки: ${pay(amount)*THIRD_COUPON} рублей ${payCent(amount)*THIRD_COUPON} копеек")

    }
}

fun pay(amount: Double): Double {
    return if (amount > TEN_THOUSAND)
        (amount * SECOND_COUPON)
    else if (amount > THOUSAND)
        (amount - FIRST_COUPON)
    else amount
}

fun payCent(amount: Double): Int {
    return ((amount - amount.toInt())*100).toInt()
}
