package org.example.project.recipients.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.example.project.recipients.presentation.components.FormTextField
import org.example.project.recipients.presentation.components.LifeLinkupLogo
import org.jetbrains.compose.resources.ExperimentalResourceApi


@Composable
fun SignupScreen(
//    state: RecipientState,
//    newRecipient: Recipient,
//    onEvent: (RecipientEvent) -> Unit,
//    modifier: Modifier = Modifier,
){
    Scaffold {
        Column (
            modifier = Modifier.fillMaxWidth()
                .padding(15.dp),
        ){
            LifeLinkupLogo(
                modifier = Modifier.height(100.dp)
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Create your account",
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(20.dp))
            FormTextField(
                value =  "",
                placeholder = "Email",
                error = null,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(15.dp))
            FormTextField(
                value =  "",
                placeholder = "Password",
                error = null,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(15.dp))
            FormTextField(
                value =  "",
                placeholder = "Confirm Password",
                error = null,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Checkbox(
                    checked = true,
                    onCheckedChange = {

                    },
                    colors = CheckboxDefaults.colors(
                        checkedColor = MaterialTheme.colorScheme.primary,
                        uncheckedColor = MaterialTheme.colorScheme.scrim
                    ),
                    modifier = Modifier.size(23.dp),
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "Sign up as donor",
                    color = MaterialTheme.colorScheme.outline,

                )

            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = {},
                modifier = Modifier.size(width = 366.dp, height = 54.dp),
                shape = RoundedCornerShape(8.dp)
            ){
                Text(
                    text = "Sign up",
                    fontWeight = FontWeight.Bold,
                )
            }
            Spacer(
                modifier = Modifier.height(15.dp)
            )
            OrSigninWithDivider()
            Spacer(modifier = Modifier.height(15.dp))
            Row (
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
                TechButton(
                    onClick = {},
                    imageUrl = "facebook.png",
                    modifier = Modifier.size(32.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                TechButton(
                    onClick = {},
                    imageUrl = "google.png",
                    modifier = Modifier.size(22.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                TechButton(
                    onClick = {},
                    imageUrl = "apple.png",
                    modifier = Modifier.size(27.dp)
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row (
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
                Text(
                    text = "Don't have an account?",
                    color = MaterialTheme.colorScheme.outline
                )
                TextButton(
                    onClick = {},
                    content = {
                        Text(
                            text = "Sign up here",
                            color = MaterialTheme.colorScheme.primary
                        )
                    }
                )
            }
        }
    }
}

@Composable
fun OrSigninWithDivider() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Divider(
            modifier = Modifier
                .weight(1f)
                .padding(end = 8.dp),
            color = Color.Gray,
            thickness = 1.dp
        )

        Text(
            text = "or sign up with",
            color = MaterialTheme.colorScheme.outline
        )

        Divider(
            modifier = Modifier
                .weight(1f)
                .padding(start = 8.dp),
            color = Color.Gray,
            thickness = 1.dp
        )
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
private fun TechButton(
    onClick: () -> Unit,
    imageUrl: String,
    modifier: Modifier
) {
    Box(
        modifier = Modifier
            .size(47.dp)
            .clip(CircleShape)
            .background(Color(0xFFB57EDC))
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Image(
            org.jetbrains.compose.resources.painterResource(imageUrl),
            null,
            modifier = modifier
        )
    }
}
