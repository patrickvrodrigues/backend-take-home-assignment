package com.patrickvrodrigues.backendtakehomeassignment.controller.response

data class ErrorResponse (
    var status: Int,
    var message: String,
    var internalCode: String,
    var errors: List<FieldErrorResponse>?
        )