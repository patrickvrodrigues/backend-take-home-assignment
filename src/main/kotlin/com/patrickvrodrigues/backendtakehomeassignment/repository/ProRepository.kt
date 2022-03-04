package com.patrickvrodrigues.backendtakehomeassignment.repository

import com.patrickvrodrigues.backendtakehomeassignment.model.ProModel
import org.springframework.data.repository.CrudRepository

interface ProRepository: CrudRepository<ProModel, Int> {
}