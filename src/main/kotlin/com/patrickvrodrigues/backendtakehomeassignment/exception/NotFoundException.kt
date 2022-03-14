package com.patrickvrodrigues.backendtakehomeassignment.exception

class NotFoundException(override val message: String, val errorCode: String) : Exception() {
}