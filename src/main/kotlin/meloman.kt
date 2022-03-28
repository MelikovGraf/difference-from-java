const val THOUSAND = 1000
const val TEN_THOUSAND = 10000
const val FIRST_COUPON = 100
const val VALUE_TO_CALCULATE_PROCENT = 99
const val SECOND_SECOND_VALUE_TO_CALCULATE_PROCENT = 20

fun main() {

    while (true) {
        print("Введите сумму покупки: ")
        var amount = readln()?.toDouble()
        print("Введите цифру 1, если вы в первый раз: ")
        val user = readln()?.toInt()
        val amountWithDiscount = (pay(amount) / 100) * VALUE_TO_CALCULATE_PROCENT
        val amountWithDiscountCent = (payCent(amount) / 100) * VALUE_TO_CALCULATE_PROCENT
        if (user == 1)
            println("Сумма к оплате с учетом скидки: ${pay(amount)} рублей ${payCent(amount).toInt()} копеек")
        else
            println("Сумма к оплате с учетом скидки: $amountWithDiscount рублей ${amountWithDiscountCent.toInt()} копеек")

    }
}

fun pay(amount: Double): Int {
    return if (amount > TEN_THOUSAND)
        (amount - (amount / SECOND_SECOND_VALUE_TO_CALCULATE_PROCENT)).toInt()
    else if (amount > THOUSAND)
        (amount - FIRST_COUPON).toInt()
    else amount.toInt()
}

fun payCent(amount: Double): Double {
    return if (amount > TEN_THOUSAND)
        (((amount - (amount / SECOND_SECOND_VALUE_TO_CALCULATE_PROCENT)) - (amount - (amount / SECOND_SECOND_VALUE_TO_CALCULATE_PROCENT)).toInt()) * 100)
    else if (amount > THOUSAND)
        (((amount - FIRST_COUPON) - (amount - FIRST_COUPON).toInt()) * 100)
    else ((amount - (amount).toInt()) * 100)
}