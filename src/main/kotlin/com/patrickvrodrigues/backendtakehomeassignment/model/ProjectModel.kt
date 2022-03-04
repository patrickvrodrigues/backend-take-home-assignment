package com.patrickvrodrigues.backendtakehomeassignment.model

import javax.persistence.*

@Entity(name="project")
class ProjectModel (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @Column
    var name: String,
    @Column
    var requiredScore: Int
    )