package com.patrickvrodrigues.backendtakehomeassignment.calculator

import com.patrickvrodrigues.backendtakehomeassignment.model.OutputModel
import com.patrickvrodrigues.backendtakehomeassignment.model.ProModel
import com.patrickvrodrigues.backendtakehomeassignment.model.ProjectModel

class OutputCalculator {
    var points = 0
    var projects: List<ProjectModel>
    var proModel: ProModel



    constructor(proModel: ProModel, projects: List<ProjectModel>){
        points = listOf(
            EducationLevelCalculator(),
            InternetTestCalculator(),
            PastExperiencesCalculator(),
            ReferralCodeCalculator(),
            WriteScoreCalculator()
        ).sumOf { it.calculate(proModel) }
        this.projects = projects
        this.proModel = proModel
    }

    fun runOutput(): OutputModel {
        val selectedProject = projects.filter{ it.requiredScore<points}.maxByOrNull{ it.requiredScore }
        var eligibleProjects: MutableList<ProjectModel> = mutableListOf()
        val ineligibleProjects: MutableList<ProjectModel> = mutableListOf()
        for (project in projects){
            if(project.requiredScore< points)
                eligibleProjects.add(project)
            else
                ineligibleProjects.add(project)
        }


        return OutputModel(
            score = points,
            selectedProject = selectedProject,
            eligibleProjects = eligibleProjects,
            ineligibleProjects = ineligibleProjects
        )
    }

}