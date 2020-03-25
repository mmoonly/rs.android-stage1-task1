package subtask2

class MiniMaxSum {

    fun getResult(input: IntArray): IntArray {
        var max = input[0]
        var min = input[0]
        var sumAll = input.sum()
        for (num in input){
            if (max<num)
                max = num

            if(min>num)
                min=num
        }
        var sumNoMax = sumAll - max
        var sumNoMin = sumAll - min

        val resArray = intArrayOf(sumNoMax,sumNoMin)
        return resArray
    }
}
