package com.example.cowork.ui.screens.bottom_nav.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cowork.R
import com.example.cowork.ui.compose_ext.noRippleClickable
import com.example.cowork.ui.theme.BackgroundF6
import com.example.cowork.ui.theme.Mikado
import com.example.cowork.ui.theme.Purple200
import com.example.cowork.ui.theme.commons.TitleWithSearchBar

@Preview
@Composable
fun Hello() {
    HomeScreen()
}

@Composable
fun HomeScreen() {

    val scrollState = rememberScrollState()
    Box(
        modifier = Modifier
            .background(color = BackgroundF6),
    ) {
        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            Box(
                modifier = Modifier
                    .background(color = Color.White)
                    .padding(
                        top = 24.dp,
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 28.dp
                    )

            ) { GreetingHeader() }

            FunctionalCards()

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "Recommendation",
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                )

                Text(
                    text = "View All",
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    color = Purple200,
                    modifier = Modifier.noRippleClickable { }
                )
            }

            repeat(3) {
                CoworkRoomCard()
            }
        }
    }
}

@Composable
private fun FunctionalCards() {
    // FIXME: Replace to LazyRow
    Row(
        modifier = Modifier
            .padding(
                top = 24.dp,
                bottom = 24.dp
            )
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround,
    ) {
        FunctionalCard(
            icon = painterResource(id = R.drawable.ic_map),
            description = "Nearest Place",
        )
        FunctionalCard(
            icon = painterResource(id = R.drawable.ic_book_room),
            description = "Book Room",
        )
        FunctionalCard(
            icon = painterResource(id = R.drawable.ic_add_event),
            description = "Add Event",
        )
    }
}

@Composable
private fun GreetingHeader() {
    Column {
        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Avatar",
            modifier = Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Mikado),
        )
        Spacer(modifier = Modifier.padding(4.dp))
        Text(
            text = "Hello, %username%!",
            color = Purple200,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.padding(8.dp))
        TitleWithSearchBar()
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun FunctionalCard(
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
    icon: Painter,
    description: String,
) {
    Card(
        modifier = modifier
            .size(96.dp),
        onClick = onClick ?: {},
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier
                    .padding(bottom = 12.dp),
                painter = icon,
                contentDescription = description,
                tint = Color.Unspecified
            )
            Text(
                fontWeight = FontWeight.Bold,
                fontSize = 10.sp,
                text = description
            )
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun CoworkRoomCard(
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
) {
    Card(
        modifier = modifier
            .width(362.dp)
            .height(134.dp),
        onClick = onClick ?: {},
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                modifier = Modifier
                    .padding(bottom = 12.dp),
                imageVector = Icons.Default.Warning,
                contentDescription = ""
            )
            Text(
                fontWeight = FontWeight.Bold,
                fontSize = 10.sp,
                text = "abobka"
            )
        }
    }
}