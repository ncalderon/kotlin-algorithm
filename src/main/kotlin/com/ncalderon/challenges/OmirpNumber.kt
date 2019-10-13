package com.ncalderon.challenges

class OmirpNumber {
    fun isPrime(n: Int): Boolean {
        if (n <= 1)
            return false

        for (i in 2 until n)
            if (n % i == 0)
                return false

        return true
    }

    /**
     * Se dice que un número es omirp, si su inverso es un número primo. Se desea que implemente un programa que decida si un número es omirp. Sin embargo, su programa no debe hacer uso de ningún tipo de datos que no sea entero o su equivalente (no puede usar cadenas de caracteres, arreglos, listas, etc.)

    Por ejemplo, el número 92 es omirp, ya que su reverso, 29, es primo.
     */
    fun isOmirp(n: Int): Boolean {
        var possibleOmirp = n
        var rev = 0
        while (possibleOmirp != 0) {
            val remaining = possibleOmirp % 10
            rev = rev * 10 + remaining
            possibleOmirp /= 10
        }
        return isPrime(rev)
    }
}
