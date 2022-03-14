package com.patrickvrodrigues.backendtakehomeassignment.model.builder

import com.patrickvrodrigues.backendtakehomeassignment.enums.EducationLevelEnum
import com.patrickvrodrigues.backendtakehomeassignment.model.InternetTestModel
import com.patrickvrodrigues.backendtakehomeassignment.model.PastExperiencesModel
import com.patrickvrodrigues.backendtakehomeassignment.model.ProModel

class ProModelBuilder {
    private var proModel: ProModel = ProModel(
        null,
        35,
        EducationLevelEnum.HIGH_SCHOOL,
        PastExperiencesModel(support = true),
        InternetTestModel(null,50.4,40.2),
        0.6,
        "token1234"
        )

    fun withAge(age: Int): ProModelBuilder{
        proModel.age = age
        return this
    }

    fun withEducationLevel(educationLevel: EducationLevelEnum): ProModelBuilder{
        proModel.educationLevel = educationLevel
        return this
    }

    fun withPastExperiences(pastExperiences: PastExperiencesModel): ProModelBuilder{
        proModel.pastExperiences = pastExperiences
        return this
    }

    fun withInternetTest(internetTest: InternetTestModel): ProModelBuilder{
        proModel.internetTest = internetTest
        return this
    }

    fun withWritingScore(writingScore: Double): ProModelBuilder{
        proModel.writingScore = writingScore
        return this
    }

    fun withReferralCode(token: String): ProModelBuilder{
        proModel.referralCode = token
        return this
    }

    fun builder(): ProModel {
        return this.proModel
    }
}