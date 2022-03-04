package com.patrickvrodrigues.backendtakehomeassignment.repository

import com.patrickvrodrigues.backendtakehomeassignment.model.PastExperiencesModel
import com.patrickvrodrigues.backendtakehomeassignment.model.ProjectModel
import org.springframework.data.repository.CrudRepository

interface PastProjectRepository: CrudRepository<ProjectModel, Int> {
}