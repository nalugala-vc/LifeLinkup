package org.example.project.recipients.presentation.newrequest

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.project.recipients.presentation.components.NotificationIcon

data class KeyValue(val key: String, val value: String)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConfirmRequestScreen(){
    val rowData = listOf(
        KeyValue("Full Name", "John Doe"),
        KeyValue("Date of Birth", "Some Value"),
        KeyValue("Email", "Some Value"),
        KeyValue("Phone Number", "Some Value"),
        KeyValue("Country", "Some Value")
    )

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
    ){
        Box(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(top = 70.dp, end = 20.dp, bottom = 20.dp, start = 20.dp )
        ){
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Confirm Request",
                    color = MaterialTheme.colorScheme.onBackground,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = "Personal Information",
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Spacer(modifier = Modifier.height(15.dp))
                rowData.forEach { keyValue ->
                    DynamicTextInfo(keyValue.key, keyValue.value)
                }
                Spacer(modifier = Modifier.width(15.dp))
                TextButton(
                    onClick = {},
                    modifier = Modifier
                        .align(Alignment.End),
                ){
                    Text(
                        text = "Edit",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                    )
                }
            }
        }

    }
}

@Composable
fun DynamicTextInfo(key: String, value: String){
    Row (
        modifier = Modifier.padding(top = 12.dp)
    ){
        Text(
            text = "$key : ",
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = value,
            color = MaterialTheme.colorScheme.outline,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )
    }
}