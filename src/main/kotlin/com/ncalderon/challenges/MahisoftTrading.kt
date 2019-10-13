package com.ncalderon.challenges

class MahisoftTrading {

    /**
     * El mercado de acciones es muy volátil, por lo que a veces se puede ganar mucho dinero, pero también perderlo.
    Mahisoft ha desarrollado un software capaz de predecir los precios de las acciones para una empresa dada, durante los próximos N días y retornarlos en forma de
    un arreglo de números reales. En este arreglo los precios vienen ordenados por día, por lo que en la posición 0 del arreglo se encuentra el precio de las acciones de
    la empresa en el día 0, igual para el día 1 y asi sucesivamente. Dado el arreglo con los precios de las acciones para una empresa, implementar una función capaz
    de calcular la mayor ganancia que es posible obtener al comprar una acción en cualquier día y venderlo en alguno de los días posteriores (no puedes vender dias
    antes de haber comprado la acción). Ejemplo:

    días    0    1    2    3     4    5    6
    precio   1    2   1     5    2.1  6    3

    En el ejemplo la maxima ganancia posible es 5, esto se logra comprando en` el dia 0 o en el dia 2 y vendiendo en el dia 5

     */
    fun mahisoftTrading(prices: Array<Double>): Double {
        var maxEarnings = 0.0
        var currentPrice: Double
        var tempPrice: Double
        var bestPrice: Double
        var i = 0
        while (i < prices.size) {
            currentPrice = prices[i]
            bestPrice = currentPrice
            for (x in i + 1 until prices.size) {
                tempPrice = prices[x]
                if (tempPrice >= bestPrice)
                    bestPrice = tempPrice
            }
            if ((bestPrice - currentPrice) > maxEarnings) {
                maxEarnings = bestPrice - currentPrice
            }
            i++
        }
        return maxEarnings
    }
}
