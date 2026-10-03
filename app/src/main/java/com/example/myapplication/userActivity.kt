package com.example.myapplication

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.MenuBook
import androidx.compose.material.icons.outlined.BatteryFull
import androidx.compose.material.icons.outlined.CreditCard
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.HomeWork
import androidx.compose.material.icons.outlined.Key
import androidx.compose.material.icons.outlined.LocalShipping
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.SignalCellular4Bar
import androidx.compose.material.icons.outlined.Wifi
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class userActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            userBody()
        }
    }
}

data class GridCardItem(
    val title: String,
    val subtitle: String,
    val icon: ImageVector,
    val iconColor: Color,
    val iconBgColor: Color
)

@Composable
fun CustomStatusBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(44.dp)
            .padding(horizontal = 20.dp),
        contentAlignment = Alignment.Center
    ) {

        Text(
            text = "9:41",
            style = TextStyle(
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            ),
            modifier = Modifier.align(Alignment.CenterStart)
        )


        Box(
            modifier = Modifier
                .width(160.dp)
                .height(30.dp)
                .align(Alignment.TopCenter)
                .clip(RoundedCornerShape(bottomStart = 18.dp, bottomEnd = 18.dp))
                .background(Color(0xFF333333))
        )


        Row(
            modifier = Modifier.align(Alignment.CenterEnd),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Outlined.SignalCellular4Bar,
                contentDescription = "Signal",
                tint = Color.White,
                modifier = Modifier.size(18.dp)
            )
            Icon(
                imageVector = Icons.Outlined.Wifi,
                contentDescription = "Wifi",
                tint = Color.White,
                modifier = Modifier.size(18.dp)
            )
            Icon(
                imageVector = Icons.Outlined.BatteryFull,
                contentDescription = "Battery",
                tint = Color.White,
                modifier = Modifier.size(20.dp)
            )
        }
    }
}

@Composable
fun userBody() {
    val emeraldGreen = Color(0xFF10C070)

    val cardItems = listOf(
        GridCardItem("Text", "11 items content", Icons.AutoMirrored.Outlined.MenuBook, Color(0xFF3F51B5), Color(0xFFE8EAF6)),
        GridCardItem("Address", "5 items content", Icons.Outlined.HomeWork, Color(0xFFE53935), Color(0xFFFFEBEE)),
        GridCardItem("Character", "15 items content", Icons.Outlined.Face, Color(0xFFFF9800), Color(0xFFFFF3E0)),
        GridCardItem("Bank card", "5 items content", Icons.Outlined.CreditCard, Color(0xFF1E88E5), Color(0xFFE3F2FD)),
        GridCardItem("Password", "21 items content", Icons.Outlined.Key, Color(0xFFFFB300), Color(0xFFFFF8E1)),
        GridCardItem("Logistics", "13 items content", Icons.Outlined.LocalShipping, Color(0xFF43A047), Color(0xFFE8F5E9))
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(emeraldGreen)
            .verticalScroll(rememberScrollState())
            .padding(bottom = 24.dp)
    ) {
        CustomStatusBar()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Spacer(modifier = Modifier.height(16.dp))


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {
                Column {
                    Text(
                        text = "Card",
                        style = TextStyle(
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "Simple and easy to use app",
                        style = TextStyle(
                            fontSize = 15.sp,
                            color = Color.White.copy(alpha = 0.9f)
                        )
                    )
                }

                Image(
                    painter = painterResource(R.drawable.profile),
                    contentDescription = "Profile",
                    modifier = Modifier
                        .size(44.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.2f)),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(24.dp))


            for (i in cardItems.indices step 2) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    CardItemView(
                        item = cardItems[i],
                        modifier = Modifier.weight(1f)
                    )

                    if (i + 1 < cardItems.size) {
                        CardItemView(
                            item = cardItems[i + 1],
                            modifier = Modifier.weight(1f)
                        )
                    } else {
                        Spacer(modifier = Modifier.weight(1f))
                    }
                }
            }

            Spacer(modifier = Modifier.height(4.dp))


            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { }
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .clip(CircleShape)
                            .background(Color(0xFFEDE7F6)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Settings,
                            contentDescription = "Settings",
                            tint = Color(0xFF7E57C2),
                            modifier = Modifier.size(28.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Column {
                        Text(
                            text = "Settings",
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF2D3748)
                            )
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Fingerprint code and so on",
                            style = TextStyle(
                                fontSize = 13.sp,
                                color = Color.Gray
                            )
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun CardItemView(
    item: GridCardItem,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.clickable { },
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 15.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp, horizontal = 12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape)
                    .background(item.iconBgColor),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = item.icon,
                    contentDescription = item.title,
                    tint = item.iconColor,
                    modifier = Modifier.size(32.dp)
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = item.title,
                style = TextStyle(
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF2D3748)
                )
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = item.subtitle,
                style = TextStyle(
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            )
        }
    }
}

@Preview
@Composable
fun userPreview() {
    userBody()
}