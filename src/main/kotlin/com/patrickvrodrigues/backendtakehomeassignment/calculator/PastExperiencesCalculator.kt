package com.patrickvrodrigues.backendtakehomeassignment.calculator

import com.patrickvrodrigues.backendtakehomeassignment.enums.EducationLevelEnum
import com.patrickvrodrigues.backendtakehomeassignment.model.ProModel

class PastExperiencesCalculator: OutputCalculatorI {

    override fun calculate(proModel: ProModel): Int {
        var pastExperiencesPoint = 0
        if (proModel.pastExperiences.support)
            pastExperiencesPoint += 3
        if (proModel.pastExperiences.sales)
            pastExperiencesPoint+= 5

        return pastExperiencesPoint

    }
}