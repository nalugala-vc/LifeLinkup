package org.example.project.recipients.presentation

sealed interface RecipientEvent {
    data class OnNameChanged(val value: String): RecipientEvent
    data class OnEmailChanged(val value: String): RecipientEvent
    data class OnPasswordChanged(val value: String): RecipientEvent
    data class OnDateOfBirthChanged(val value: String): RecipientEvent
    data class OnPhoneNumberChanged(val value: String): RecipientEvent
    data class OnCountryChanged(val value: String): RecipientEvent
    data class OnMedicalHistoryChanged(val value: String): RecipientEvent
    data class OnMedicalConditionsChanged(val value: String): RecipientEvent
    data class OnCurrentMedicationChanged(val value: String): RecipientEvent
    data class OnBloodTypeChanged(val value: String): RecipientEvent
    data class OnHLAClassIChanged(val value: String): RecipientEvent
    data class OnHLAClassIIChanged(val value: String): RecipientEvent
    data class OnBodyOrganChanged(val value: String): RecipientEvent
}