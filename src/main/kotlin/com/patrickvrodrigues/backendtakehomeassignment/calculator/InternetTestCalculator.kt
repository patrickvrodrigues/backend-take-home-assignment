package com.patrickvrodrigues.backendtakehomeassignment.calculator

import com.patrickvrodrigues.backendtakehomeassignment.enums.EducationLevelEnum
import com.patrickvrodrigues.backendtakehomeassignment.model.ProModel

class InternetTestCalculator: OutputCalculatorI {

    override fun calculate(proModel: ProModel): Int {
        var internetTestPoint = 0

        if(proModel.internetTest.downloadSpeed>50.0)
            internetTestPoint += 1
        else if(proModel.internetTest.downloadSpeed<5.0)
            internetTestPoint += -1

        return internetTestPoint
    }
}