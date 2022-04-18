package com.example.cowork.ui.screens.greeting

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.cowork.R
import com.example.cowork.features.greeting.presentation.GreetingViewModel
import com.example.cowork.ui.theme.Grey8C
import com.example.cowork.ui.theme.TextColor
import com.example.cowork.utils.navigation.NavScreens
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch
import org.koin.androidx.compose.viewModel

@OptIn(ExperimentalPagerApi::class)
@Composable
fun GreetingViewPagerScreen(navController: NavHostController) {
    val viewModel by viewModel<GreetingViewModel>()
    val pagerState = rememberPagerState()
    val composeScope = rememberCoroutineScope()
    val pageCount = 3

    Box(Modifier.fillMaxSize()) {
        val images = viewModel.images.collectAsState()
        val titles = viewModel.titles
        val content = viewModel.descriptionContents

        HorizontalPager(
            count = pageCount,
            state = pagerState,
        ) { page ->
            if (images.value.isNotEmpty()) {
                GreetingPageScreen(
                    greetingImage = painterResource(images.value[page]),
                    greetingTitle = titles[page],
                    content = content[page],
                )
            }
        }

        DotsIndicator(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp),
            totalDots = pageCount,
            selectedIndex = pagerState.currentPage,
            selectedColor = TextColor,
            unSelectedColor = Grey8C
        )

        IconButton(
            modifier = Modifier
                .wrapContentSize()
                .align(Alignment.BottomEnd)
                .padding(16.dp)
                .clip(RoundedCornerShape(8.dp)),
            onClick = {
                composeScope.launch {
                    if (pagerState.currentPage < pagerState.pageCount - 1)
                        pagerState.animateScrollToPage(pagerState.currentPage + 1)
                    else navController.navigate(NavScreens.SignInScreen.route)
                }
            },
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_right_arrow_24dp),
                contentDescription = "Arrow",
                tint = Color.White,
                modifier = Modifier
                    .wrapContentSize()
                    .background(color = TextColor)
                    .padding(12.dp)
            )
        }
    }
}