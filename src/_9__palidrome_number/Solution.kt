package _9__palidrome_number

class Solution {
    fun isPalindrome(x: Int): Boolean {
        var result = 0
        var temp = x
        while(temp!=0){
            val surplus = temp%10
            result = result*10 + surplus
            temp/=10
        }
        if(x<0){
            return result == -x
        }
        return result == x
    }
}