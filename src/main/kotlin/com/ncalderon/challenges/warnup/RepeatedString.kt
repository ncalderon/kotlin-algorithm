package com.ncalderon.challenges.warnup

fun repeatedString(s: String, n: Long): Long {
    var count: Long = s.count { it == 'a' }.toLong()

    val repetitions = n / s.length
    count *= repetitions
    for (i in 0 until n % s.length) {
        if (s[i.toInt()] === 'a') count++
    }

    return count
}