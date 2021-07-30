package com.ncalderon.challenges

const val max_rows = 6
const val max_columns = 6

fun hourglassSum(arr: Array<Array<Int>>): Int {
    var maxHourGlassSum = 0
    for (i in 0 until max_rows - 4){
        for (j in 0 until max_columns - 4){
            val topIdxRow = i
            val centerIdxRow: Int = i+1
            val bottomIdxRow = i+1

            val leftIdxColumn = j+2
            val centerIdxColumn = j+1
            val rightIdxColumn = j+2
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
