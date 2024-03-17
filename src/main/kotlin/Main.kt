package org.example

fun main() {
    val isRegularCustomer = false
    var regularDiscount = 0.0
    var mainDiscount = 0.0
    val middleDiscount = 100.0
    val highDiscountRate = 0.05
    val sumPurchase = 20_000.0
    if (isRegularCustomer && sumPurchase > 1_000.0) {
        regularDiscount = sumPurchase / 100
    }
    if (sumPurchase <= 1_000.0) {
        mainDiscount = 0.0
    } else if (sumPurchase > 1_000.0 && sumPurchase <= 10_000.0) {
        mainDiscount = middleDiscount
    } else if (sumPurchase > 10_000.0) mainDiscount = sumPurchase * highDiscountRate
    val totalDiscount = (regularDiscount + mainDiscount).toInt()
    println("Скидка на сумму покупки в $sumPurchase рублей составила $totalDiscount рублей")
}

