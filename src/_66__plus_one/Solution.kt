package _66__plus_one

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var size = digits.size
        var result: IntArray
        if (isFullNine(digits)) {
            size++
            result = IntArray(size)
            for (i in result.indices) {
                if (i == 0) {
                    result[i] = 1
                } else {
                    result[i] = 0
                }
            }
        } else {
            result = IntArray(size)
            var id = size - 1
            var rememberOne = true
            while (id >= 0) {
                if (digits[id] == 9 && rememberOne) {
                    result[id] = 0
                } else if (digits[id] < 9 && rememberOne ) {
                    result[id] = digits[id] + 1
                    rememberOne = false
                } else {
                    result[id] = digits[id]
                }
                id--
            }
        }
        return result
    }

    private fun isFullNine(number: IntArray): Boolean {
        for (i in number) {
            if (i != 9) {
                return false
            }
        }
        return true
    }
}
