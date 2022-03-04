package com.patrickvrodrigues.backendtakehomeassignment.service
import com.patrickvrodrigues.backendtakehomeassignment.model.ProjectModel
import com.patrickvrodrigues.backendtakehomeassignment.repository.PastProjectRepository

import org.springframework.stereotype.Service

@Service
class ProjectService(
    val projectRepository: PastProjectRepository
) {

    fun create(project: ProjectModel){
        projectRepository.save(project)
    }

    fun getAll(): List<ProjectModel> {
        return projectRepository.findAll().toList()
    }

}