package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val size = digitString.length/2

        val result = StringBuilder(digitString)

        var changes = k
        var numberOfChanges = 0

        for(i in 0 until size)
        {
            if(digitString[i]!=digitString[digitString.length-i-1])
                numberOfChanges++
        }
        numberOfChanges = changes-numberOfChanges
        if(numberOfChanges<0)
            return "-1"

        for(i in 0 until size)
        {
            if(digitString[i]!=digitString[digitString.length-i-1]) {
                if (numberOfChanges > 0 && (digitString[i] != '9'
                            && digitString[digitString.length - i - 1] != '9')) {
                    result.setCharAt(i, '9')
                    result.setCharAt(digitString.length - i - 1, '9')
                    numberOfChanges--
                    changes -= 2
                } else {
                    val temp = maxOf(digitString[i], digitString[digitString.length - i - 1])
                    result.setCharAt(i, temp)
                    result.setCharAt(digitString.length - i - 1, temp)
                    changes--
                }
            }
        }
        return result.toString()
    }
}
