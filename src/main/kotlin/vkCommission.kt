const val MIN_COMMISSION = 35
const val ZERO = 0
const val COMMISSION = 0.0075
fun main() {
    while (true) {
        print("Input amount: ")
        val amount = readln().toDouble()
        val resultCommission = amount * COMMISSION
        val result = if (resultCommission <= ZERO)
            ZERO
        else if (resultCommission <= MIN_COMMISSION)
            MIN_COMMISSION
        else resultCommission
        val resultFinish: Int = result.toInt()
        val resultCent = (resultCommission - resultFinish)*100
        val resultCentTwo = resultCent.toInt()
        println("The commission will be $resultFinish rubles $resultCentTwo copeyks")
    }
}
