package com.patrickvrodrigues.backendtakehomeassignment.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "internet_test")
data class InternetTestModel (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @Column
    @JsonProperty("download_speed")
    var downloadSpeed: Double,
    @Column
    @JsonProperty("upload_speed")
    var uploadSpeed: Double
        )