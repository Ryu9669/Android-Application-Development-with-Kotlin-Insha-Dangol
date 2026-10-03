package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddBox
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileBody()

                }
            }
        }

@Composable
fun ProfileBody(){
    Column(
        modifier = Modifier.fillMaxSize().background(color = Color.White
        )
    ) {
        Row(
            modifier=Modifier.fillMaxWidth().padding(horizontal = 8.dp, vertical = 9.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Icon(
                painter = painterResource(com.example.myapplication.R.drawable.outline_arrow_back_ios_new_24),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Text("Spoidermon", style = TextStyle(
                fontSize =21.sp,
                fontWeight = FontWeight.Bold,
            ))
            Icon(
                painter = painterResource(R.drawable.baseline_more_horiz_24),
                contentDescription = null,
                modifier = Modifier.size(28.dp)
            )


        }
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            val instagramColors = listOf(
                Color(0xFFF58529),
                Color(0xFFDD2A7B),
                Color(0xFF8134AF),
                Color(0xFF515BD4)
            )

            Image(
                painter = painterResource(R.drawable.spi),
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
                    .border(
                        width = 4.dp,
                        brush = Brush.linearGradient(colors = instagramColors),
                        shape = CircleShape
                    )
                    .padding(3.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop

            )
            Column {
                Text("714",style = TextStyle(
                    fontSize =15.sp,
                    fontWeight = FontWeight.SemiBold,))
                Text("Posts",style = TextStyle(
                    fontSize =15.sp,
                    fontWeight = FontWeight.SemiBold,))


            }

            Column {
                Text("1M",style = TextStyle(
                    fontSize =15.sp,
                    fontWeight = FontWeight.SemiBold,))
                Text("Followers",style = TextStyle(
                    fontSize =15.sp,
                    fontWeight = FontWeight.SemiBold,))

            }
            Column {
                Text("10",style = TextStyle(
                    fontSize =15.sp,
                    fontWeight = FontWeight.SemiBold,))
                Text("Following",style = TextStyle(
                    fontSize =15.sp,
                    fontWeight = FontWeight.SemiBold,))

            }


            }
        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 3.dp, vertical = 2.dp)) {
            Column {
                Text(
                    "@NepaliSpoider", style = TextStyle(
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                )

            }
        }
        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp, vertical = 2.dp)
        ) {
            Column {
                val bio = buildAnnotatedString {
                    append("Ironman is my stepfather ")
                    withStyle(
                        style = SpanStyle(
                            color = Color(0xFF00376B),
                            fontWeight = FontWeight.Medium
                        )
                    ) {
                        append("#marvel")
                    }
                }
                Text(text = bio, style = TextStyle(fontSize = 15.sp))
                Column() {
                    Text("Followed by Bulk and Thorm",style = TextStyle(
                            fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold))
                }
            }
        }

        ElevatedButton(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 3.dp, vertical = 2.dp),
            shape = RoundedCornerShape(size = 12.dp),
            colors = buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            border = BorderStroke(
                width = 1.dp,
                color = Color.Gray
            ), onClick = {}){
            Text("Follow",style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,))
        }


        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 3.dp, vertical = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween
            ) {
            ElevatedButton(
                modifier = Modifier.size(130.dp, 40.dp),
                shape = RoundedCornerShape(size = 7.dp),
                colors = buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                ),
                border = BorderStroke(
                    width = 1.dp,
                    color = Color.Gray
                ),onClick = {}) {
                Text("Message", style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,))
            }
            ElevatedButton(
                modifier = Modifier.size(130.dp, 40.dp),
                shape = RoundedCornerShape(size = 7.dp),
                colors = buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                ),
                border = BorderStroke(
                    width = 1.dp,
                    color = Color.Gray
                ),
                onClick = {}) {
                Text("Email", style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,))
            }
            ElevatedButton(
                modifier = Modifier.size(120.dp, 40.dp),
                shape = RoundedCornerShape(size = 7.dp),
                colors = buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                ),
                border = BorderStroke(
                    width = 1.dp,
                    color = Color.Gray
                ),onClick = {}) {
                Text("Call", style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,))
                Icon(
                    painter = painterResource(R.drawable.outline_add_call_24),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp)
                )
            }


        }



        Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp, vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically )
        {
            val highlightModifier = Modifier
                .size(60.dp)
                .border(
                    width = 2.dp,
                    color = Color.LightGray,
                    shape = CircleShape
                )
                .padding(2.dp)
                .clip(CircleShape)

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(R.drawable.doctor),
                    contentDescription = null,
                    modifier = highlightModifier,
                    contentScale = ContentScale.Crop
                )
                Text("Trange", style = TextStyle(fontSize = 13.sp))
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(R.drawable.thanos),
                    contentDescription = null,
                    modifier = highlightModifier,
                    contentScale = ContentScale.Crop
                )
                Text("Thano", style = TextStyle(fontSize = 13.sp))
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(R.drawable.octopus),
                    contentDescription = null,
                    modifier = highlightModifier,
                    contentScale = ContentScale.Crop
                )
                Text("Octopus", style = TextStyle(fontSize = 13.sp))
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(R.drawable.octopus),
                    contentDescription = null,
                    modifier = highlightModifier,
                    contentScale = ContentScale.Crop
                )
                Text("Octopus", style = TextStyle(fontSize = 13.sp))
            }
        }



        }



    }


@Preview
@Composable
fun ProfilePreview(){
    ProfileBody()
}

