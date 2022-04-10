const val THOUSAND = 1000
const val TEN_THOUSAND = 10000
const val FIRST_COUPON = 100
const val THIRD_COUPON = .99
const val SECOND_COUPON = .95

fun main() {

    while (true) {
        print("Введите сумму покупки: ")
        var amountRub = readln().toDouble()
        print("Введите цифру 1, если вы в первый раз: ")
        val user = readln().toInt()
        val amountWithDiscountRub: Double = pay(amountRub, user)
        val amountWithDiscountCent: Int = (amountWithDiscountRub * 100).toInt()
        val rubles = amountWithDiscountRub.toInt()
        val cents = amountWithDiscountCent % 100
        println("Сумма к оплате с учетом скидки: $rubles рублей $cents копеек")
    }
}

fun pay(amount: Double, user: Int): Double {
    val commission = if (amount > TEN_THOUSAND)
            (amount * SECOND_COUPON)
        else if (amount > THOUSAND)
            (amount - FIRST_COUPON)
        else amount
    return if (user == 1) commission
    else commission*THIRD_COUPON
    }
