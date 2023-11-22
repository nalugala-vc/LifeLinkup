package org.example.project.recipients.data

data class Recipient(
    val id: Long?,
    val name: String,
    val email: String,
    val password: String,
    val dateOfBirth: String?,
    val phoneNumber: String?,
    val country: String?,
    val emergencyContact: EmergencyContact?,
    val medicalHistory: String?,
    val medicalCondition: String?,
    val currentMedication: String?,
    val bloodType: String?,
    val hlaClassI: String?,
    val hlaClassII: String?,
    val bodyOrganType: String?,
)
