package com.patrickvrodrigues.backendtakehomeassignment.enums

enum class Errors(val code: String, val message: String) {

    THA001("THA-001", "Invalid Request"),
    THA101("THA-101", "Pro [%s] not exists"),
    THA201("THA-201", "Internet Test [%s] not exists"),
    THA301("THA-301", "Past Experiences [%s] not exists")
}