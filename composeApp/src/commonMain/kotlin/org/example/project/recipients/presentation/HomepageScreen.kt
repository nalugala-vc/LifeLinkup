package org.example.project.recipients.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.example.project.recipients.presentation.components.HomepageTiles
import org.example.project.recipients.presentation.components.NotificationIcon

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomepageScreen(){
    val itemList = listOf(
        RoundedContainerItem(
            imageUrl = "image (1).jpg",
            title = "Learn more about the Kidney!!",
            paragraph = "This is the first paragraph text."
        ),
        RoundedContainerItem(
            imageUrl = "image (2).jpg",
            title = "Title 2",
            paragraph = "This is the second paragraph text."
        ),
        RoundedContainerItem(
            imageUrl = "image (3).jpg",
            title = "Kidney Cancer: The Killer!",
            paragraph = "This is the third paragraph text."
        ),
    )
    Scaffold (
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "LifeLinkup",
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
        LazyColumn(
            modifier = Modifier.padding(top = 70.dp, end = 20.dp, bottom = 20.dp, start = 20.dp )
        ) {
            items(itemList) { item ->
                HomepageTiles(
                    imageUrl = item.imageUrl,
                    title = item.title,
                    paragraph = item.paragraph
                )
                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}

data class RoundedContainerItem(
    val imageUrl: String,
    val title: String,
    val paragraph: String
)




