package com.patrickvrodrigues.backendtakehomeassignment.validation

import javax.validation.Constraint
import javax.validation.Payload
import kotlin.reflect.KClass

@Constraint(validatedBy = [EducationLevelCorrectValidator::class])
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
annotation class EducationLevelCorrect (
    val message:String = "Incorrect Education Level",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = []
        )