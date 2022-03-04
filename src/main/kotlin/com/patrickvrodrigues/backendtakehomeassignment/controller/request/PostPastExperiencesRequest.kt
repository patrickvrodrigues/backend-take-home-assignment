package com.patrickvrodrigues.backendtakehomeassignment.controller.request

import com.fasterxml.jackson.annotation.JsonAlias
import com.patrickvrodrigues.backendtakehomeassignment.enums.EducationLevelEnum
import com.patrickvrodrigues.backendtakehomeassignment.model.InternetTestModel
import com.patrickvrodrigues.backendtakehomeassignment.model.PastExperiencesModel
import javax.persistence.Column
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class PostPastExperiencesRequest (
    var sales: Boolean = false,
    var support: Boolean = false
        )