package com.patrickvrodrigues.backendtakehomeassignment.controller

import com.patrickvrodrigues.backendtakehomeassignment.controller.request.PostProjectRequest
import com.patrickvrodrigues.backendtakehomeassignment.extension.toModel
import com.patrickvrodrigues.backendtakehomeassignment.model.ProjectModel
import com.patrickvrodrigues.backendtakehomeassignment.service.ProjectService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("project")
class ProjectController (
    val projectService: ProjectService
        ){
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Valid requestProject: PostProjectRequest){
        var project = projectService.create(requestProject.toModel())
    }

    @GetMapping
    fun getAll(): List<ProjectModel>{
        return projectService.getAll();
    }
}