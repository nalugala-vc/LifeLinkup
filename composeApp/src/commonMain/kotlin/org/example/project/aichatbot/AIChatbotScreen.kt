package org.example.project.aichatbot

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.Alignment
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.material.*
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatScreen() {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(DrawerValue.Closed)

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Text("Drawer title", modifier = Modifier.padding(16.dp))
            }
        },
    ){
        Scaffold(
            scaffoldState = scaffoldState,
            topBar = {
                TopAppBar(
                    title = { Text(text = "AI ASSISTANT", color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.Bold) },
                    navigationIcon = {
                        IconButton(onClick = {
                            scope.launch {
                                drawerState.apply {
                                    if (isClosed) open() else close()
                                }
                            }
                        }) {
                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = "Drawe"
                            )
                        }
                    },
                    elevation = 4.dp,
                    backgroundColor = Color.White,
                    contentColor = Color.Gray,
                    modifier = Modifier.background(Color.White),
                )
            },
            content = {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    // Chats list
                    LazyColumn (modifier = Modifier.padding(bottom = 60.dp)){
                        items(10) { index ->
                            ChatItem(index % 2 == 0)
                        }
                    }
                }
            },
            bottomBar = {
                BottomNavigation (
                    modifier = Modifier.height(70.dp)
                        .fillMaxWidth()
                ){
                    androidx.compose.material3.Surface(
                        modifier = Modifier.fillMaxWidth()
                            .height(70.dp),
                        color = MaterialTheme.colorScheme.background
                    ){
                        Row(
                            modifier = Modifier
                                .padding(8.dp)
                                .height(70.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            TextField(
                                value = "",
                                onValueChange = {  },
                                placeholder = {
                                    Text(
                                        text = "Ask me anything",
                                        fontSize = 14.sp,
                                        color = MaterialTheme.colorScheme.primary,
                                    )
                                },
                                shape = RoundedCornerShape(15.dp),
                                colors = TextFieldDefaults.textFieldColors(
                                    backgroundColor = MaterialTheme.colorScheme.scrim,
                                    unfocusedIndicatorColor = Color.Transparent,
                                    focusedIndicatorColor = Color.Transparent,
                                    cursorColor = MaterialTheme.colorScheme.outline,
                                ),
                                modifier = Modifier
                                    .width(300.dp)
                                    .height(50.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))

                            IconButton(
                                onClick = {
                                    // Handle send button click
                                }
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Send,
                                    contentDescription = "Send",
                                    tint = MaterialTheme.colorScheme.primary
                                )
                            }
                        }
                    }

                }

            }
        )
    }

}

@Composable
fun ChatItem(isUser: Boolean) {
    val backgroundColor = if (isUser) MaterialTheme.colorScheme.secondaryContainer else MaterialTheme.colorScheme.surfaceVariant
    val content = if (isUser) "User's message" else "AI Bot's message"


    Column (modifier = Modifier.fillMaxWidth()){
        Box(
            modifier = Modifier
                .align(if (isUser) Alignment.End else Alignment.Start)
                .clip(
                    RoundedCornerShape(
                        topStart = 48f,
                        topEnd = 48f,
                        bottomStart = if (isUser) 48f else 0f,
                        bottomEnd = if (isUser) 0f else 48f
                    )
                )
                .background(backgroundColor)
                .padding(16.dp)
        ) {
            Text(text = content)
        }
        Spacer(modifier = Modifier.height(10.dp))
    }

//    Box(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp)
//            .background(backgroundColor, MaterialTheme.shapes.medium)
//            .padding(16.dp)
//    ) {
//        Text(text = content, color = MaterialTheme.colorScheme.onPrimaryContainer)
//    }
}



