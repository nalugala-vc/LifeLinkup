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

enum class HlaclassI(val text: String) {
    HLA_A("HLA-A"),
    HLA_B("HLA-B"),
    HLA_C("HLA-C"),

}

@Composable
fun HLAClassISelection(onHlaclassISelected: (HlaclassI) -> Unit) {
    var selectedHlaclassI by remember { mutableStateOf<HlaclassI?>(null) }

    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        for (hlaclassI in HlaclassI.values()) {
            HlaclassIButton(
                hlaclassI = hlaclassI,
                isSelected = hlaclassI == selectedHlaclassI,
                onHlaclassISelected = {
                    selectedHlaclassI = hlaclassI
                    onHlaclassISelected(hlaclassI)
                }
            )
        }
    }
}

@Composable
fun HlaclassIButton(
    hlaclassI: HlaclassI,
    isSelected: Boolean,
    onHlaclassISelected: () -> Unit
) {
    Box(
        modifier = Modifier
            .padding(top = 12.dp)
            .clip(RoundedCornerShape(7.dp))
            .background(Color(0xFFF8E9FF))
            .clickable { onHlaclassISelected() }
            .border(
                width = 2.dp,
                color = if (isSelected) Color(0xFF800080) else Color.Transparent,
                shape = RoundedCornerShape(7.dp)
            )
    ) {
        Text(
            text = hlaclassI.text,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.outline,
            modifier = Modifier
                .padding(top = 13.dp, start = 20.dp, end = 20.dp, bottom = 13.dp )
        )
    }
}


