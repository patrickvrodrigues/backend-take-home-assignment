package com.patrickvrodrigues.backendtakehomeassignment.calculator

import com.patrickvrodrigues.backendtakehomeassignment.enums.EducationLevelEnum
import com.patrickvrodrigues.backendtakehomeassignment.model.ProModel

class EducationLevelCalculator: OutputCalculatorI {

    override fun calculate(proModel: ProModel): Int {

        val educationLevelPoint = when(proModel.educationLevel) {
            EducationLevelEnum.NO_EDUCATION -> 0
            EducationLevelEnum.HIGH_SCHOOL -> 1
            EducationLevelEnum.BACHELORS_DEGREE_OR_HIGH -> 2
            else -> 0
        }
        return educationLevelPoint
    }
}