package com.patrickvrodrigues.backendtakehomeassignment.controller

import com.patrickvrodrigues.backendtakehomeassignment.calculator.OutputCalculator
import com.patrickvrodrigues.backendtakehomeassignment.controller.request.PostProRequest
import com.patrickvrodrigues.backendtakehomeassignment.extension.toProModel
import com.patrickvrodrigues.backendtakehomeassignment.model.OutputModel
import com.patrickvrodrigues.backendtakehomeassignment.model.ProModel
import com.patrickvrodrigues.backendtakehomeassignment.service.ProService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid


@RestController
@RequestMapping("pro")
class ProController(
    val proService: ProService,
    val projectController: ProjectController
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Valid requestPro: PostProRequest): OutputModel {
    var pro = proService.create(requestPro.toProModel())
    return OutputCalculator(requestPro.toProModel(), projectController.getAll()).runOutput()
    }

    @GetMapping
    fun getAll(): List<ProModel>{
        return proService.getAll();
    }

}