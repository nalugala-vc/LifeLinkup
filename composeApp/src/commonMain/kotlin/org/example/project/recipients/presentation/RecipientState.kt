package org.example.project.recipients.presentation

data class RecipientState(
    val nameError: String? = null,
    val passwordError: String? = null,
    val emailError: String? = null,
    val phoneNumberError: String? = null,
    val dateOfBirthError: String? = null,
    val countryError: String? = null,
    val medicalHistoryError: String? = null,
    val medicalConditionsError: String? = null,
    val currentMedicationError: String? = null,
    val bloodTypeError: String? = null,
    val hlaClassIError: String? = null,
    val hlaClassIIError: String? = null,
    val bodyOrganTypeError: String? = null,
)
