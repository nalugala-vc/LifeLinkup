import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.example.project.core.presentation.LifeLinkupTheme
import org.example.project.recipients.presentation.HomepageScreen
import org.example.project.recipients.presentation.LoginScreen
import org.example.project.recipients.presentation.SignupScreen
import org.example.project.recipients.presentation.newrequest.EmergencyContactScreen
import org.example.project.recipients.presentation.newrequest.PersonalInfoScreen

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean,
) {
    LifeLinkupTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor,
    ){
        Surface (
            modifier = Modifier.fillMaxSize(),
            color = androidx.compose.material3.MaterialTheme.colorScheme.background
        ) {
            EmergencyContactScreen()
        }
    }
}

