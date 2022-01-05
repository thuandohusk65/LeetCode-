package logestcommonprefix

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var result = ""
        var shortestString = strs[0]
        var numOfShortest = strs[0].length
        for (j in 1..numOfShortest) {
            var index = 0
            var isBreak = false
            while (index < strs.size) {
                if (strs[index].indexOf(shortestString.substring(0, j)) == 0) {
                    index++
                } else {
                    isBreak = true
                    break
                }
            }
            if (isBreak == true) {
                break
            }
            if (shortestString.substring(0, j).length > result.length) {
                result = shortestString.substring(0, j)
            }

        }

        return result
    }
}



