package org.example.project.recipients.presentation.newrequest

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.project.recipients.presentation.components.BloodType
import org.example.project.recipients.presentation.components.BloodTypeSelection
import org.example.project.recipients.presentation.components.BodyOrgansDropdown
import org.example.project.recipients.presentation.components.FormTextField
import org.example.project.recipients.presentation.components.HLAClassIISelection
import org.example.project.recipients.presentation.components.HLAClassISelection
import org.example.project.recipients.presentation.components.HlaclassI
import org.example.project.recipients.presentation.components.HlaclassII
import org.example.project.recipients.presentation.components.NotificationIcon

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BodyTypeInfoScreen(){
    var selectedBloodType by remember { mutableStateOf<BloodType?>(null) }
    var selectedHlaclassI by remember { mutableStateOf<HlaclassI?>(null) }
    var selectedHlaclassII by remember { mutableStateOf<HlaclassII?>(null) }

    Scaffold (
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "New Request",
                        color = MaterialTheme.colorScheme.primary,
                        fontWeight = FontWeight.Bold
                    )
                },
                actions = {
                    NotificationIcon(
                        onClick = {},
                    )
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.White)
            )
        }
    ) {
        Box(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(top = 70.dp, end = 20.dp, bottom = 20.dp, start = 20.dp )
        ){
            Column  {
                Text(
                    text = "Blood Type",
                    color = MaterialTheme.colorScheme.onBackground,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Select your blood type!",
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontSize = 14.sp
                )
                Spacer(modifier = Modifier.height(15.dp))
                BloodTypeSelection { bloodType ->
                    selectedBloodType = bloodType
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Human Leukocyte Antigen",
                    color = MaterialTheme.colorScheme.onBackground,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(7.dp))
                Text(
                    text = "HLA Class I",
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.height(15.dp))
                HLAClassISelection { hlaClassI ->
                    selectedHlaclassI = hlaClassI
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "HLA Class II",
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.height(15.dp))
                HLAClassIISelection { hlaClassII ->
                    selectedHlaclassII = hlaClassII
                }
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Body Organ Type",
                    color = MaterialTheme.colorScheme.onBackground,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(15.dp))
                BodyOrgansDropdown()
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = {},
                    modifier = Modifier
                        .size(width = 100.dp, height = 50.dp)
                        .align(Alignment.End),
                    shape = RoundedCornerShape(10.dp)
                ){
                    Text(
                        text = "Next",
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}