package com.patrickvrodrigues.backendtakehomeassignment.controller.request

import com.fasterxml.jackson.annotation.JsonAlias
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull


data class PostInternetTestRequest (

    @NotNull
    @field:DecimalMin("0.1")
    @JsonAlias("download_speed")
    var downloadSpeed: Double,

    @NotNull
    @field:DecimalMin("0.1")
    @JsonAlias("upload_speed")
    var uploadSpeed: Double
)
