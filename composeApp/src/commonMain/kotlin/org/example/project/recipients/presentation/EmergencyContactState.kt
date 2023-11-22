package org.example.project.recipients.presentation

data class EmergencyContactState(
    val nameError: String? = null,
    val relationError: String? = null,
    val emailError: String? = null,
    val phoneNumberError: String? = null,
)
