package com.example.cowork.ui.screens.sign_in

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cowork.R
import com.example.cowork.ui.compose_ext.noRippleClickable

@Composable
fun OAuthServices(
    modifier: Modifier = Modifier
) {
    // FIXME: replace to lazyRow
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_gmail_icon),
            contentDescription = "OAuth from gmail",
            modifier = Modifier
                .padding(start = 8.dp, end = 8.dp)
                .noRippleClickable { /* todo */ },
        )

        Image(
            painter = painterResource(id = R.drawable.ic_git_icon),
            contentDescription = "OAuth from github",
            modifier = Modifier
                .padding(start = 8.dp, end = 8.dp)
                .noRippleClickable { /* todo */ },
        )
    }
}