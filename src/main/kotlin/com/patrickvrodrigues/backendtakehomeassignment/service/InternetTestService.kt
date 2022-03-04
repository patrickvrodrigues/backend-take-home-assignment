package com.patrickvrodrigues.backendtakehomeassignment.service

import com.patrickvrodrigues.backendtakehomeassignment.model.InternetTestModel
import com.patrickvrodrigues.backendtakehomeassignment.model.ProModel
import com.patrickvrodrigues.backendtakehomeassignment.repository.InternetTestRepository
import com.patrickvrodrigues.backendtakehomeassignment.repository.ProRepository
import org.springframework.stereotype.Service

@Service
class InternetTestService(
    val internetTestRepository: InternetTestRepository
) {

    fun create(internetTest: InternetTestModel){
        internetTestRepository.save(internetTest)
    }

}