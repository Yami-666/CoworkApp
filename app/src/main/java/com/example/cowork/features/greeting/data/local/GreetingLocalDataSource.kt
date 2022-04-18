package com.example.cowork.features.greeting.data.local

import com.example.cowork.R
import com.example.cowork.features.greeting.data.repository.IGreetingLocalDataSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.koin.core.annotation.Factory

@Factory
internal class GreetingLocalDataSource(
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : IGreetingLocalDataSource {
    override suspend fun getImages(): List<Int> = withContext(ioDispatcher) {
        listOf(
            R.drawable.first_greeting_image,
            R.drawable.second_greeting_image,
            R.drawable.third_greeting_image,
        )
    }
}