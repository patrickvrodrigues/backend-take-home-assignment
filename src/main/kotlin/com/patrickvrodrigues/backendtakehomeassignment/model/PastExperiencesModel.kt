package com.patrickvrodrigues.backendtakehomeassignment.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name="past_experiences")
data class PastExperiencesModel (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @Column
    var sales: Boolean = false,
    @Column
    var support: Boolean = false
        )