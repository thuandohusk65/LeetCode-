package _15__3_sum

import java.util.*
import kotlin.collections.ArrayList

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        Arrays.sort(nums)
        var result = ArrayList<List<Int>>()
        var tempNums = ArrayList<Int>()
        for (num in nums) {
            tempNums.add(num)
        }
        tempNums.sort()
        for (i in 0 until tempNums.size - 2) {
            if (i == 0 || (i > 0 && tempNums[i] != tempNums[i - 1])) {
                var sum = -tempNums[i]
                var secondId = i + 1
                var thirdId = tempNums.size - 1

                while (secondId < thirdId) {
                    if (tempNums[secondId] + tempNums[thirdId] == sum) {
                        result.add(listOf(tempNums[i], tempNums[secondId], tempNums[thirdId]))
                        while (secondId < thirdId) {
                            if (secondId < thirdId && tempNums[secondId] == tempNums[secondId + 1]) {
                                secondId++
                            } else if (secondId < thirdId && tempNums[thirdId] == tempNums[thirdId - 1]) {
                                thirdId--
                            } else {
                                secondId++
                                thirdId--
                                break
                            }
                        }
                    } else if (tempNums[secondId] + tempNums[thirdId] < sum) {
                        secondId++
                    } else if (tempNums[secondId] + tempNums[thirdId] > sum) {
                        thirdId--
                    }
                }
            }
        }
        return result
    }
}

fun main() {
    var solution = Solution()
    val nums = intArrayOf(0, 0, 0, 0)
    println(solution.threeSum(nums))
}