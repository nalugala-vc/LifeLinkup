package org.example.project.recipients.domain

data class EmergencyContact(
    val id: Long?,
    val name: String,
    val email: String,
    val phoneNumber: String,
    val relation: String,
)
