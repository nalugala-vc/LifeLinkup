package org.example.project.recipients.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import org.example.project.recipients.domain.Recipient
import org.example.project.recipients.domain.RecipientDatasource

class RecipientViewModel(
    private val recipientDatasource: RecipientDatasource
): ViewModel() {
    private val _state = MutableStateFlow(RecipientState())

    var newRecipient: Recipient? by mutableStateOf(null)
        private set

    fun onEvent(event: RecipientEvent){
        when (event){
            is RecipientEvent.OnBloodTypeChanged -> {
                newRecipient = newRecipient?.copy(
                bloodType = event.value
            )
        }
            is RecipientEvent.OnBodyOrganChanged -> {
                newRecipient = newRecipient?.copy(
                    bodyOrganType = event.value
                )
            }
            is RecipientEvent.OnCountryChanged -> {
                newRecipient = newRecipient?.copy(
                    country = event.value
                )
            }
            is RecipientEvent.OnCurrentMedicationChanged -> {
                newRecipient = newRecipient?.copy(
                    currentMedication = event.value
                )
            }
            is RecipientEvent.OnDateOfBirthChanged -> {
                newRecipient = newRecipient?.copy(
                    dateOfBirth = event.value
                )
            }
            is RecipientEvent.OnEmailChanged -> {
                newRecipient = newRecipient?.copy(
                    email = event.value
                )
            }
            is RecipientEvent.OnHLAClassIChanged -> {
                newRecipient = newRecipient?.copy(
                    hlaClassI = event.value
                )
            }
            is RecipientEvent.OnHLAClassIIChanged -> {
                newRecipient = newRecipient?.copy(
                    hlaClassII = event.value
                )
            }
            is RecipientEvent.OnMedicalConditionsChanged -> {
                newRecipient = newRecipient?.copy(
                    medicalCondition = event.value
                )
            }
            is RecipientEvent.OnMedicalHistoryChanged -> {
                newRecipient = newRecipient?.copy(
                    medicalHistory = event.value
                )
            }
            is RecipientEvent.OnNameChanged -> {
                newRecipient = newRecipient?.copy(
                    name = event.value
                )
            }
            is RecipientEvent.OnPasswordChanged -> {
                newRecipient = newRecipient?.copy(
                    password = event.value
                )
            }
            is RecipientEvent.OnPhoneNumberChanged -> {
                newRecipient = newRecipient?.copy(
                    phoneNumber = event.value
                )
            }
        }
    }
}