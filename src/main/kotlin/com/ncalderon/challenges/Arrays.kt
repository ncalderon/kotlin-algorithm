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
    var bribeCount = 0;
    var isChaotic = false
    var current = -1
    var currentBribeCount = 0;
    for (i in (q.size-1) downTo 0) {
        if (current == -1)
            current = i

        if (q[i] == current+1){
            currentBribeCount = current-i
            bribeCount+= currentBribeCount
            current = -1
        }

        if (currentBribeCount >= 3){
            isChaotic = true;
            break;
        }
    }

    if (!isChaotic){
        bribeCount+=bribeCount
        println(bribeCount)
    }
    else
        println("Too chaotic")
}

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