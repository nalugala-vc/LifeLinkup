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

    var newContact: Recipient? by mutableStateOf(null)
        private set

    fun onEvent(event: RecipientEvent){
        when (event){
            is RecipientEvent.OnBloodTypeChanged -> TODO()
            is RecipientEvent.OnBodyOrganChanged -> TODO()
            is RecipientEvent.OnCountryChanged -> TODO()
            is RecipientEvent.OnCurrentMedicationChanged -> TODO()
            is RecipientEvent.OnDateOfBirthChanged -> TODO()
            is RecipientEvent.OnEmailChanged -> TODO()
            is RecipientEvent.OnHLAClassIChanged -> TODO()
            is RecipientEvent.OnHLAClassIIChanged -> TODO()
            is RecipientEvent.OnMedicalConditionsChanged -> TODO()
            is RecipientEvent.OnMedicalHistoryChanged -> TODO()
            is RecipientEvent.OnNameChanged -> TODO()
            is RecipientEvent.OnPasswordChanged -> TODO()
            is RecipientEvent.OnPhoneNumberChanged -> TODO()
        }
    }
}