package org.example.project.recipients.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight

enum class BloodType(val text: String) {
    A_POSITIVE("A+"),
    A_NEGATIVE("A-"),
    B_POSITIVE("B+"),
    B_NEGATIVE("B-"),
    O_POSITIVE("O+"),
    O_NEGATIVE("O-"),
    AB_POSITIVE("AB+"),
    AB_NEGATIVE("AB-"),
    BOMBAY_BLOOD_GROUP("Bombay Blood Group")
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun BloodTypeSelection(onBloodTypeSelected: (BloodType) -> Unit) {
    var selectedBloodType by remember { mutableStateOf<BloodType?>(null) }

    FlowRow (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        for (bloodType in BloodType.values()) {
            BloodTypeButton(
                bloodType = bloodType,
                isSelected = bloodType == selectedBloodType,
                onBloodTypeSelected = {
                    selectedBloodType = bloodType
                    onBloodTypeSelected(bloodType)
                }
            )
        }
    }
}

@Composable
fun BloodTypeButton(
    bloodType: BloodType,
    isSelected: Boolean,
    onBloodTypeSelected: () -> Unit
) {
    Box(
        modifier = Modifier
            .padding(top = 12.dp)
            .clip(RoundedCornerShape(7.dp))
            .background(Color(0xFFF8E9FF))
            .clickable { onBloodTypeSelected() }
            .border(
                width = 2.dp,
                color = if (isSelected) Color(0xFF800080) else Color.Transparent,
                shape = RoundedCornerShape(7.dp)
            )
    ) {
        Text(
            text = bloodType.text,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.outline,
            modifier = Modifier
                .padding(top = 13.dp, start = 20.dp, end = 20.dp, bottom = 13.dp )
        )
    }
}
@Composable
fun BloodTypeSelectionScreen() {
    var selectedBloodType by remember { mutableStateOf<BloodType?>(null) }

    BloodTypeSelection { bloodType ->
        selectedBloodType = bloodType
    }

    // You can use the selectedBloodType for further processing or display
}


