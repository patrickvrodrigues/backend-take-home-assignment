package com.patrickvrodrigues.backendtakehomeassignment.service

import com.patrickvrodrigues.backendtakehomeassignment.model.InternetTestModel
import com.patrickvrodrigues.backendtakehomeassignment.model.PastExperiencesModel
import com.patrickvrodrigues.backendtakehomeassignment.model.ProModel
import com.patrickvrodrigues.backendtakehomeassignment.repository.ProRepository
import org.springframework.stereotype.Service

@Service
class ProService(
    val proRepository: ProRepository,
    val internetTestService: InternetTestService,
    val pastExperiencesService: PastExperiencesService
) {

    fun create(pro: ProModel){
        val internetTest = InternetTestModel(
            downloadSpeed = pro.internetTest.downloadSpeed,
            uploadSpeed = pro.internetTest.uploadSpeed
            )
        internetTestService.create(internetTest)
        pro.internetTest = internetTest

        val pastExperiences = PastExperiencesModel(
            sales = pro.pastExperiences.sales,
            support = pro.pastExperiences.support
        )

        pastExperiencesService.create(pastExperiences)
        pro.pastExperiences = pastExperiences
        proRepository.save(pro)
    }

    fun getAll(): List<ProModel> {
        return proRepository.findAll().toList()
    }
}