package com.patrickvrodrigues.backendtakehomeassignment.exception

class BadRequestException(override val message: String, val errorCode: String) : Exception() {
}