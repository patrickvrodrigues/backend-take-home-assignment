package com.patrickvrodrigues.backendtakehomeassignment.service

import com.patrickvrodrigues.backendtakehomeassignment.enums.EducationLevelEnum
import com.patrickvrodrigues.backendtakehomeassignment.model.ProModel
import com.patrickvrodrigues.backendtakehomeassignment.model.builder.ProModelBuilder
import com.patrickvrodrigues.backendtakehomeassignment.repository.ProRepository
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
class ProServiceTest {

    @MockK
    private lateinit var proRepository: ProRepository
    @MockK
    private lateinit var internetTestService: InternetTestService
    @MockK
    private lateinit var pastExperiencesService: PastExperiencesService

    @InjectMockKs
    private lateinit var proService: ProService

    @Test
    fun `should return all pro's`(){

        val fakePros = listOf(ProModelBuilder().builder(),ProModelBuilder().builder())
        every { proRepository.findAll() } returns fakePros

        val pros = proService.getAll()

        assertEquals(fakePros, pros)
        verify(exactly = 1) {proRepository.findAll()}
    }

    @Test
    fun `should create pro`(){
        val pro = ProModelBuilder().builder()

        every { internetTestService.create(pro.internetTest) } returns Unit
        every { pastExperiencesService.create(pro.pastExperiences) } returns Unit
        every { proRepository.save(pro) } returns pro

        proService.create(pro)


        verify(exactly = 1) { proRepository.save(pro) }
    }




}