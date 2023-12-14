package com.ncalderon.challenges


fun fizzBuzz(n: Int): Unit {
    // Write your code here
    for (i in 1 .. n){
        val sb = StringBuilder();
        if (n % 3 == 0)
            sb.append("Fizz")
        if (n % 5 == 0)
            sb.append("Fizz")

        if (sb.isNotEmpty())
            println(sb.toString())
        else
            println(i)
    }
}