package com.patrickvrodrigues.backendtakehomeassignment.model

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity(name="project")
class ProjectModel (
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @Column
    var name: String,
    @Column
    @JsonIgnore
    var requiredScore: Int
    )