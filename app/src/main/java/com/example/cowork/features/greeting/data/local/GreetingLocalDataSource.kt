package com.example.cowork.features.greeting.data.local

import com.example.cowork.R
import com.example.cowork.features.greeting.data.repository.IGreetingLocalDataSource
import org.koin.core.annotation.Factory

@Factory
internal class GreetingLocalDataSource : IGreetingLocalDataSource {
    override suspend fun getImages(): List<Int> {
        return listOf(
            R.drawable.first_greeting_image,
            R.drawable.second_greeting_image,
            R.drawable.third_greeting_image,
        )
    }
}