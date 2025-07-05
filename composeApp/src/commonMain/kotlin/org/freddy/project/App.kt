package org.freddy.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.SuggestionChipDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import portafolioapp.composeapp.generated.resources.Res
import portafolioapp.composeapp.generated.resources.compose_multiplatform

@Composable
fun App() {
    MaterialTheme(
        colorScheme = darkColorScheme(
            primary = Color(0xFF1E88E5), // UX recommended: Blue 600
            secondary = Color(0xFF43A047), // UX recommended: Green 600
            background = Color(0xFF121212), // UX recommended: true black for dark mode
            surface = Color(0xFF1E1E1E), // UX recommended: slightly lighter than background
            onPrimary = Color(0xFFFFFFFF), // White text on primary color
            onSecondary = Color(0xFFFFFFFF), // White text on secondary color
            onBackground = Color(0xFFFFFFFF), // White text on background
            onSurface = Color(0xFFFFFFFF), // White text on surface
            onTertiary = Color(0xFFFFFFFF), // White text on tertiary
            onError = Color(0xFFFFFFFF) // White text on error
        )
    ) {
        val visible = remember { mutableStateOf(true) }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Header Section
            item {
                AnimatedVisibility(
                    visible = visible.value,
                    enter = fadeIn(tween(1000)) + slideInVertically(tween(1000)) { it / 2 }
                ) {
                    HeaderSection()
                }
                Spacer(modifier = Modifier.height(24.dp))
            }

            // About Section
            item {
                AnimatedVisibility(
                    visible = visible.value,
                    enter = fadeIn(tween(1200)) + slideInVertically(tween(1200)) { it / 2 }
                ) {
                    AboutSection()
                }
                Spacer(modifier = Modifier.height(24.dp))
            }

            // Skills Section
            item {
                AnimatedVisibility(
                    visible = visible.value,
                    enter = fadeIn(tween(1400)) + slideInVertically(tween(1400)) { it / 2 }
                ) {
                    SkillsSection()
                }
                Spacer(modifier = Modifier.height(24.dp))
            }

            // Projects Section
            item {
                AnimatedVisibility(
                    visible = visible.value,
                    enter = fadeIn(tween(1600)) + slideInVertically(tween(1600)) { it / 2 }
                ) {
                    ProjectsSection()
                }
                Spacer(modifier = Modifier.height(24.dp))
            }

            // Contact Section
            item {
                AnimatedVisibility(
                    visible = visible.value,
                    enter = fadeIn(tween(1800)) + slideInVertically(tween(1800)) { it / 2 }
                ) {
                    ContactSection()
                }
            }
        }
    }
}

@Composable
fun HeaderSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.primary)
        ) {
            Image(
                painterResource(Res.drawable.compose_multiplatform),
                contentDescription = "Profile Picture",
                modifier = Modifier.fillMaxSize()
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Freddy Lazo",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground
        )

        Text(
            text = "Android Developer & Kotlin Multiplatform Enthusiast",
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.7f)
        )
    }
}

@Composable
fun AboutSection() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                // Replacing Icon with a simple Box as placeholder
                Box(
                    modifier = Modifier
                        .size(24.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.primary)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "About Me",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "I'm a passionate Kotlin Multiplatform developer with expertise in building cross-platform applications. I love creating elegant solutions using Compose Multiplatform and exploring new technologies.",
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f)
            )
        }
    }
}

@Composable
fun SkillsSection() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Skills",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface
            )

            Spacer(modifier = Modifier.height(12.dp))

            val skills = listOf("Kotlin", "Compose", "KMM", "Android", "iOS", "Web", "Git", "CI/CD")

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(skills) { skill ->
                    // Replace Chip with custom FilterChip from Material3
                    SuggestionChip(
                        onClick = { },
                        label = { Text(text = skill) },
                        colors = SuggestionChipDefaults.suggestionChipColors(
                            containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.7f),
                            labelColor = MaterialTheme.colorScheme.onPrimary
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun ProjectsSection() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Projects",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface
            )

            Spacer(modifier = Modifier.height(12.dp))

            ProjectItem(
                title = "KMM Portfolio App",
                description = "A cross-platform portfolio application built with Kotlin Multiplatform and Compose.",
                technologies = listOf("KMM", "Compose")
            )

            Spacer(modifier = Modifier.height(8.dp))

            ProjectItem(
                title = "Multiplatform Data Visualization",
                description = "Interactive data visualization tool that works on Android, iOS, and Web.",
                technologies = listOf("KMM", "Compose", "Charts")
            )

            Spacer(modifier = Modifier.height(8.dp))

            ProjectItem(
                title = "Cross-Platform Networking Library",
                description = "A shared networking library for Kotlin Multiplatform projects.",
                technologies = listOf("KMM", "Ktor", "Coroutines")
            )
        }
    }
}

@Composable
fun ProjectItem(title: String, description: String, technologies: List<String>) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface.copy(
                alpha = 0.5f
            )
        )
    ) {
        Column(
            modifier = Modifier.padding(12.dp)
        ) {
            Text(
                text = title,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = description,
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                technologies.forEach { tech ->
                    Text(
                        text = tech,
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.secondary,
                        modifier = Modifier
                            .clip(RoundedCornerShape(4.dp))
                            .background(MaterialTheme.colorScheme.secondary.copy(alpha = 0.1f))
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun ContactSection() {
    Card(
        modifier = Modifier.fillMaxWidth().padding(bottom = 30.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                // Replacing Icon with a simple Box as placeholder
                Box(
                    modifier = Modifier
                        .size(24.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.primary)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Get In Touch",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = {
                    makePhoneCall("945305659") // Replace with your actual phone number
                },
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
                shape = RoundedCornerShape(8.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.Phone,
                    contentDescription = "Phone",
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Contact Me")
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                modifier = Modifier.clickable {
                    openUrl("https://www.linkedin.com/in/freddy-lazo-cardenas-tech/")
                },
                text = "LinkedIn",
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.primary,
                textAlign = TextAlign.Center,
            )
        }
    }
}
