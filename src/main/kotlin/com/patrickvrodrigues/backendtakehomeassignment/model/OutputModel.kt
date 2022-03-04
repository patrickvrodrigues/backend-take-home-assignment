package com.patrickvrodrigues.backendtakehomeassignment.model

data class OutputModel (
    val score: Int,
    val selectedProject: ProjectModel?,
    val eligibleProjects: List<ProjectModel>,
    val ineligibleProjects: List<ProjectModel>
        )