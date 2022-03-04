package com.patrickvrodrigues.backendtakehomeassignment.controller.request

import com.fasterxml.jackson.annotation.JsonAlias
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.NotNull

data class PostProjectRequest (
    @NotNull
    var name: String,

    @NotNull
    @JsonAlias("required_score")
    var requiredScore: Int
    )