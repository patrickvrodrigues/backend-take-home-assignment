package com.patrickvrodrigues.backendtakehomeassignment.controller.request

import com.fasterxml.jackson.annotation.JsonAlias
import com.patrickvrodrigues.backendtakehomeassignment.enums.EducationLevelEnum
import com.patrickvrodrigues.backendtakehomeassignment.model.InternetTestModel
import com.patrickvrodrigues.backendtakehomeassignment.model.PastExperiencesModel
import com.patrickvrodrigues.backendtakehomeassignment.validation.EducationLevelCorrect
import javax.persistence.Enumerated
import javax.validation.Valid
import javax.validation.constraints.*

data class PostProRequest (
    @field:NotNull
    @field:Min(18)
    var age: Int,

    @NotNull
    @JsonAlias("education_level")
    @EducationLevelCorrect
    @Enumerated
    var educationLevel: EducationLevelEnum,

    @NotNull
    @JsonAlias("past_experiences")
    var pastExperiences: PostPastExperiencesRequest,

    @NotNull
    @JsonAlias("internet_test")
    var internetTest: PostInternetTestRequest,

    @field:DecimalMin("0.0")
    @field:DecimalMax("1.0")
    @JsonAlias("writing_score")
    var writingScore: Double,


    @JsonAlias("referral_code")
    var referralCode: String
        )