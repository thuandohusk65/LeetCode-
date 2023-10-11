package _121__best_time_to_buy_and_sell_stock

import kotlin.math.max

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var pointer = prices[0]
        prices.forEach { price ->
            if(price < pointer) {
                pointer = price
            }
            if(price > pointer) {
                val newProfit = price - pointer
                profit = max(newProfit, profit)
            }
        }
        return profit
    }
}

fun main() {
    val profit = Solution().maxProfit(intArrayOf(7,1,5,3,6,4))
    print(profit)
}