package com.patrickvrodrigues.backendtakehomeassignment.repository

import com.patrickvrodrigues.backendtakehomeassignment.model.PastExperiencesModel
import org.springframework.data.repository.CrudRepository

interface PastExperiencesRepository: CrudRepository<PastExperiencesModel, Int> {
}