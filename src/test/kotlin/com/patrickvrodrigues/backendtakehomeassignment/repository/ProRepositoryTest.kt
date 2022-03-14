package com.patrickvrodrigues.backendtakehomeassignment.repository

import com.patrickvrodrigues.backendtakehomeassignment.model.builder.InternetTestModelBuilder
import com.patrickvrodrigues.backendtakehomeassignment.model.builder.PastExperiencesModelBuilder
import com.patrickvrodrigues.backendtakehomeassignment.model.builder.ProModelBuilder
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("test")
@ExtendWith(MockKExtension::class)
class ProRepositoryTest {

    @Autowired
    private lateinit var proRepository: ProRepository
    @Autowired
    private lateinit var internetTestRepository: InternetTestRepository
    @Autowired
    private lateinit var pastExperiencesRepository: PastExperiencesRepository

    @BeforeEach
    fun setup() {
        proRepository.deleteAll()
        internetTestRepository.deleteAll()
        pastExperiencesRepository.deleteAll()
    }
    @Test
    fun `should save pro`(){

        val pro = proRepository.save(ProModelBuilder()
            .withInternetTest(internetTestRepository.save(InternetTestModelBuilder().builder()))
            .withPastExperiences(pastExperiencesRepository.save(PastExperiencesModelBuilder().builder()))
            .builder()
        )

        val pros = proRepository.findAll()

        assertEquals(listOf(pro), pros)
    }
}