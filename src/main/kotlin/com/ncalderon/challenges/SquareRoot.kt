package com.ncalderon.challenges

class SquareRoot {

    /**
     * Dado un número entero positivo n: cómo implementaría la función sqrt(n) que devuelve la raiz cuadrada de n.
    Ejemplo:
    Entrada: 4
    Salida: 2

     */
    fun sqrt(n: Int): Int {
        if (n == 0 || n == 1)
            return n

        var result = 1
        var i = 1
        while (result <= n) {
            i++
            result = i * i
        }
        return i - 1
    }
}
