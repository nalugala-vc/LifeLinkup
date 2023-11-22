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

enum class HlaclassII(val text: String) {
    HLA_DP("HLA-DP"),
    HLA_DQ("HLA-DQ"),
    HLA_DR("HLA-DR"),

}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun HLAClassIISelection(onHlaclassIISelected: (HlaclassII) -> Unit) {
    var selectedHlaclassII by remember { mutableStateOf<HlaclassII?>(null) }

    FlowRow  (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        for (hlaclassII in HlaclassII.values()) {
            HlaclassIIButton(
                hlaclassII = hlaclassII,
                isSelected = hlaclassII == selectedHlaclassII,
                onHlaclassIISelected = {
                    selectedHlaclassII = hlaclassII
                    onHlaclassIISelected(hlaclassII)
                }
            )
        }
    }
}

@Composable
fun HlaclassIIButton(
    hlaclassII: HlaclassII,
    isSelected: Boolean,
    onHlaclassIISelected: () -> Unit
) {
    Box(
        modifier = Modifier
            .padding(top = 12.dp)
            .clip(RoundedCornerShape(7.dp))
            .background(Color(0xFFF8E9FF))
            .clickable { onHlaclassIISelected() }
            .border(
                width = 2.dp,
                color = if (isSelected) Color(0xFF800080) else Color.Transparent,
                shape = RoundedCornerShape(7.dp)
            )
    ) {
        Text(
            text = hlaclassII.text,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.outline,
            modifier = Modifier
                .padding(top = 13.dp, start = 20.dp, end = 20.dp, bottom = 13.dp )
        )
    }
}


