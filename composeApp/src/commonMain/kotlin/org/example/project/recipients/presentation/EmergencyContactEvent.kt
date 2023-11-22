package org.example.project.recipients.presentation

sealed interface EmergencyContactEvent{
    data class OnNameChanged(val value: String): EmergencyContactEvent
    data class OnEmailChanged(val value: String): EmergencyContactEvent
    data class OnPhoneNumberChanged(val value: String): EmergencyContactEvent
    data class OnRelationChanged(val value: String): EmergencyContactEvent
}