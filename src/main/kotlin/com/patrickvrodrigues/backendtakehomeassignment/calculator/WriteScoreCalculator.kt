package com.patrickvrodrigues.backendtakehomeassignment.calculator

import com.patrickvrodrigues.backendtakehomeassignment.enums.EducationLevelEnum
import com.patrickvrodrigues.backendtakehomeassignment.model.ProModel

class WriteScoreCalculator: OutputCalculatorI {

    override fun calculate(proModel: ProModel): Int {
        var writeScorePoint = 0

        if(proModel.writingScore<0.3)
            writeScorePoint+= -1
        if(proModel.writingScore in 0.3..0.7)
            writeScorePoint+= 1
        if(proModel.writingScore > 0.7){
            writeScorePoint+= 2
        }
        
        return writeScorePoint
    }
}