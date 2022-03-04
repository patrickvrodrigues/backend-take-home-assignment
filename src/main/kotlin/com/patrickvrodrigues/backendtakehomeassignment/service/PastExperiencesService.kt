package com.patrickvrodrigues.backendtakehomeassignment.service

import com.patrickvrodrigues.backendtakehomeassignment.model.InternetTestModel
import com.patrickvrodrigues.backendtakehomeassignment.model.PastExperiencesModel
import com.patrickvrodrigues.backendtakehomeassignment.model.ProModel
import com.patrickvrodrigues.backendtakehomeassignment.repository.InternetTestRepository
import com.patrickvrodrigues.backendtakehomeassignment.repository.PastExperiencesRepository
import com.patrickvrodrigues.backendtakehomeassignment.repository.ProRepository
import org.springframework.stereotype.Service

@Service
class PastExperiencesService(
    val pastExperiencesRepository: PastExperiencesRepository
) {

    fun create(pastExperiences: PastExperiencesModel){
        pastExperiencesRepository.save(pastExperiences)
    }

}