package com.ncalderon.challenges

const val max_rows = 6
const val max_columns = 6

fun hourglassSum(arr: Array<Array<Int>>): Int {
    var maxHourGlassSum = -46
    for (i in 0 until max_rows - 2) {
        for (j in 0 until max_columns - 2) {
            val topIdxRow = i
            val centerIdxRow: Int = i + 1
            val bottomIdxRow = i + 2

            val leftIdxColumn = j
            val centerIdxColumn = j + 1
            val rightIdxColumn = j + 2
            var currentHourGlassSum = arr[topIdxRow][leftIdxColumn] + arr[topIdxRow][centerIdxColumn] +
                    arr[topIdxRow][rightIdxColumn]
            currentHourGlassSum += arr[centerIdxRow][centerIdxColumn]
            currentHourGlassSum += arr[bottomIdxRow][leftIdxColumn] + arr[bottomIdxRow][centerIdxColumn] +
                    arr[bottomIdxRow][rightIdxColumn]

            if (currentHourGlassSum > maxHourGlassSum)
                maxHourGlassSum = currentHourGlassSum
        }
    }

    return maxHourGlassSum
}

fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    val rotatedIndices = (0 until d).toList()
    val unchangedIndices = (d until a.size).toList()
    val result = a.sliceArray(unchangedIndices.plus(rotatedIndices))
    return result
}

fun minimumBribes(q: Array<Int>): Unit {
    val chaoticThreshold = 3
    var bribeCount = 0;
    var isChaotic = false
    var currentBribeCount = 0;

    for (i in (q.size-1) downTo 0) {
        currentBribeCount = q[i] - (i+1)
        if (currentBribeCount < 0)
            currentBribeCount = 0
        if (currentBribeCount >= chaoticThreshold){
            isChaotic = true
            break
        }
        bribeCount += currentBribeCount
    }

    if (!isChaotic){
        println(bribeCount)
    }
    else
        println("Too chaotic")
}

//        currentBribeCount = 0
//        for (j in i downTo 0){
//            if (q[j] == i+1 || q[i] > j)
//                break
//            currentBribeCount+= 1
//
//            if (currentBribeCount >= chaoticThreshold){
//                isChaotic = true;
//                break;
//            }
//        }
//        bribeCount += currentBribeCount

/*private fun countBribe(currentIdx: Int, q: Array<Int>): Int {
    if (currentIdx+1 == q[i]){
        return q[i]-i;
    }
    for (i in (q.size-1) downTo 0) {

    }
}*/

//        var currentValue = q[i]
//        if (currentValue == i)
//            continue
//        else if (currentValue == i+2)
//            bribeCount++
//        else if (currentValue == i+3)
//            bribeCount+=2
//        else {
//            isChaotic = true;
//            break;
//        }