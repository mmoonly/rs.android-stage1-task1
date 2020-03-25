package subtask4

import com.sun.xml.internal.fastinfoset.util.StringArray

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val res = ArrayList<String>()
        val openSymb = "([<"
        val closeSymb = ")]>"
        var symbolType = 0
        var counter = 0
        var tempStr = ""

        for (a in inputString.indices){
            symbolType = openSymb.indexOf(inputString[a])
            if(symbolType != -1){
                counter = 0
                tempStr = ""
                for (i in a+1 until inputString.length){
                    if (inputString[i] == closeSymb[symbolType] && counter == 0)
                        break
                    tempStr += inputString[i]
                    if (inputString[i]==openSymb[symbolType])
                        counter++
                    if (inputString[i]==closeSymb[symbolType])
                        counter--
                }
                res.add(tempStr)
            }
        }
            return res.toTypedArray()



    }
}
