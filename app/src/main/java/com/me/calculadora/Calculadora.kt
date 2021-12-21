package com.me.calculadora

class Calculadora {

    companion object {
        fun calcular(exp: String): Int {
            var resultado = 0

            // separa os números da expressão em um array
            val nums = exp.split("[+-/*]".toRegex()).toTypedArray()

            // separa os símbolos das operações em um array
            val op = exp.split("\\d".toRegex()).toTypedArray()

            var i = 1

            resultado += nums[0].toInt()

            op.forEach {
                if (it != "") {
                    if (i < op.size) {
                        when (it) {
                            "+" -> resultado += nums[i].toInt()

                            "-" -> resultado -= nums[i].toInt()

                            "*" -> resultado *= nums[i].toInt()

                            "/" -> resultado /= nums[i].toInt()
                        }
                    }

                    i++
                }

            }

            return resultado
        }
    }
}
