package com.patrickvrodrigues.backendtakehomeassignment.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.patrickvrodrigues.backendtakehomeassignment.controller.request.PostInternetTestRequest
import com.patrickvrodrigues.backendtakehomeassignment.controller.request.PostPastExperiencesRequest
import com.patrickvrodrigues.backendtakehomeassignment.controller.request.PostProRequest
import com.patrickvrodrigues.backendtakehomeassignment.model.builder.InternetTestModelBuilder
import com.patrickvrodrigues.backendtakehomeassignment.model.builder.PastExperiencesModelBuilder
import com.patrickvrodrigues.backendtakehomeassignment.model.builder.ProModelBuilder
import com.patrickvrodrigues.backendtakehomeassignment.repository.InternetTestRepository
import com.patrickvrodrigues.backendtakehomeassignment.repository.PastExperiencesRepository
import com.patrickvrodrigues.backendtakehomeassignment.repository.ProRepository
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*
import kotlin.random.Random

@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration
@ActiveProfiles("test")
class ProControllerTest{

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Autowired
    private lateinit var proRepository: ProRepository

    @Autowired
    private lateinit var internetTestRepository: InternetTestRepository

    @Autowired
    private lateinit var pastExperiencesRepository: PastExperiencesRepository

    @Autowired
    private lateinit var objectMapper: ObjectMapper

    @BeforeEach
    fun setup() = proRepository.deleteAll()

    @AfterEach
    fun tearDown() = proRepository.deleteAll()

    @Test
    fun `should return all pros`(){
        val pro1 = proRepository.save(
            ProModelBuilder()
                .withInternetTest(internetTestRepository.save(InternetTestModelBuilder().builder()))
                .withPastExperiences(pastExperiencesRepository.save(PastExperiencesModelBuilder().builder()))
                .builder()
        )
        val pro2 = proRepository.save(
            ProModelBuilder()
                .withInternetTest(internetTestRepository.save(InternetTestModelBuilder().builder()))
                .withPastExperiences(pastExperiencesRepository.save(PastExperiencesModelBuilder().builder()))
                .builder()
        )

        val listPro = listOf(pro1, pro2)
        var id = 0
        for (pro in listPro){

            mockMvc.perform(get("/pro"))
                .andExpect(status().isOk)
                .andExpect(jsonPath("$[$id].id").value(pro.id))
                .andExpect(jsonPath("$[$id].age").value(pro.age))
                .andExpect(jsonPath("$[$id].education_level").value(pro.educationLevel.name))
                .andExpect(jsonPath("$[$id].past_experiences.sales").value(pro.pastExperiences.sales))
                .andExpect(jsonPath("$[$id].past_experiences.support").value(pro.pastExperiences.support))
                .andExpect(jsonPath("$[$id].internet_test.download_speed").value(pro.internetTest.downloadSpeed))
                .andExpect(jsonPath("$[$id].internet_test.upload_speed").value(pro.internetTest.uploadSpeed))
                .andExpect(jsonPath("$[$id].writing_score").value(pro.writingScore))
                .andExpect(jsonPath("$[$id].referral_code").value(pro.referralCode))
            id += 1
        }
    }

    @Test
    fun `dont create pro with age less than 18`(){

        val pro = ProModelBuilder().withAge(17).builder()
        val request = PostProRequest(
            pro.age,
            pro.educationLevel,
            PostPastExperiencesRequest(pro.pastExperiences.sales, pro.pastExperiences.support),
            PostInternetTestRequest(pro.internetTest.downloadSpeed, pro.internetTest.uploadSpeed),
            pro.writingScore,
            "token1234"
        )

        mockMvc.perform(post("/pro")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(request))
        )
            .andExpect(status().isUnprocessableEntity)
            .andExpect(jsonPath("$.status").value(422))
            .andExpect(jsonPath("$.message").value("Invalid Request"))
            .andExpect(jsonPath("$.errors[0].message").value("must be greater than or equal to 18"))
            .andExpect(jsonPath("$.errors[0].field").value("age"))
    }

    @Test
    fun `dont create pro with writing_score less than 1`(){
        val pro = ProModelBuilder().withWritingScore(1.1).builder()
        val request = PostProRequest(
            pro.age,
            pro.educationLevel,
            PostPastExperiencesRequest(pro.pastExperiences.sales, pro.pastExperiences.support),
            PostInternetTestRequest(pro.internetTest.downloadSpeed, pro.internetTest.uploadSpeed),
            pro.writingScore,
            "token1234"
        )

        mockMvc.perform(post("/pro")
            .contentType(MediaType.APPLICATION_JSON)
            .content(objectMapper.writeValueAsString(request))
        )
            .andExpect(status().isUnprocessableEntity)
            .andExpect(jsonPath("$.status").value(422))
            .andExpect(jsonPath("$.message").value("Invalid Request"))
            .andExpect(jsonPath("$.errors[0].message").value("must be less than or equal to 1.0"))
            .andExpect(jsonPath("$.errors[0].field").value("writingScore"))
    }
}