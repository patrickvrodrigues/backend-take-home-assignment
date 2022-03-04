package com.patrickvrodrigues.backendtakehomeassignment.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.patrickvrodrigues.backendtakehomeassignment.enums.EducationLevelEnum
import javax.persistence.*

@Entity(name="pro")
data class ProModel (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @Column(nullable = false)
    var age: Int,

    @Column
    @Enumerated(EnumType.STRING)
    @JsonProperty("education_level")
    var educationLevel: EducationLevelEnum,
    @OneToOne
    @JsonProperty("past_experiences")
    var pastExperiences: PastExperiencesModel,
    @OneToOne
    @JsonProperty("internet_test")
    var internetTest: InternetTestModel,
    @Column
    @JsonProperty("writing_score")
    var writingScore: Double,
    @JsonProperty("referral_code")
    var referralCode: String?
        )