package com.patrickvrodrigues.backendtakehomeassignment.repository

import com.patrickvrodrigues.backendtakehomeassignment.model.InternetTestModel
import org.springframework.data.repository.CrudRepository

interface InternetTestRepository: CrudRepository<InternetTestModel, Int> {

}