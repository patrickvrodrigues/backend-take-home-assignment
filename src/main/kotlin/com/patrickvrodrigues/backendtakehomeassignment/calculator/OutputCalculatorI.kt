package com.patrickvrodrigues.backendtakehomeassignment.calculator

import com.patrickvrodrigues.backendtakehomeassignment.model.ProModel

interface OutputCalculatorI {
    fun calculate(proModel: ProModel): Int
}