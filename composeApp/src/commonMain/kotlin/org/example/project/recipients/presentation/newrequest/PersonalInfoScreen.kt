package org.example.project.recipients.presentation.newrequest

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.project.recipients.presentation.components.FormTextField
import org.example.project.recipients.presentation.components.NotificationIcon

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersonalInfoScreen(){
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
        Column (
            modifier = Modifier.padding(top = 70.dp, end = 20.dp, bottom = 20.dp, start = 20.dp )
        )  {
            Text(
                text = "Personal Information",
                color = MaterialTheme.colorScheme.onBackground,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(30.dp))
            FormTextField(
                value =  "",
                placeholder = "Full Name",
                error = null,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(15.dp))
            FormTextField(
                value =  "",
                placeholder = "Date Of Birth",
                error = null,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(15.dp))
            FormTextField(
                value =  "",
                placeholder = "Email",
                error = null,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(15.dp))
            FormTextField(
                value =  "",
                placeholder = "Phone Number",
                error = null,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(15.dp))
            FormTextField(
                value =  "",
                placeholder = "Country",
                error = null,
                modifier = Modifier.fillMaxWidth()
            )
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