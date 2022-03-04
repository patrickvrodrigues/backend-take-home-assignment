package com.patrickvrodrigues.backendtakehomeassignment.extension

import com.patrickvrodrigues.backendtakehomeassignment.controller.request.PostInternetTestRequest
import com.patrickvrodrigues.backendtakehomeassignment.controller.request.PostPastExperiencesRequest
import com.patrickvrodrigues.backendtakehomeassignment.controller.request.PostProRequest
import com.patrickvrodrigues.backendtakehomeassignment.controller.request.PostProjectRequest
import com.patrickvrodrigues.backendtakehomeassignment.model.InternetTestModel
import com.patrickvrodrigues.backendtakehomeassignment.model.PastExperiencesModel
import com.patrickvrodrigues.backendtakehomeassignment.model.ProModel
import com.patrickvrodrigues.backendtakehomeassignment.model.ProjectModel


fun PostProRequest.toProModel(): ProModel{
    return ProModel(
        age = this.age,
        educationLevel = this.educationLevel,
        pastExperiences = this.pastExperiences.toModel(),
        internetTest = this.internetTest.toModel(),
        writingScore = this.writingScore,
        referralCode = this.referralCode
    )
}

fun PostPastExperiencesRequest.toModel(): PastExperiencesModel{
    return PastExperiencesModel(
        sales = this.sales,
        support = this.support
    )
}

fun PostInternetTestRequest.toModel(): InternetTestModel{
    return InternetTestModel(
        downloadSpeed = this.downloadSpeed,
        uploadSpeed = this.uploadSpeed
    )
}

fun PostProjectRequest.toModel(): ProjectModel{
    return ProjectModel(
        name = this.name,
        requiredScore = this.requiredScore
    )
}