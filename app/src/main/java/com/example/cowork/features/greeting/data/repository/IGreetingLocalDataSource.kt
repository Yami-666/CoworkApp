package com.example.cowork.features.greeting.data.repository

import com.example.core.data.local.ILocalDataSource

interface IGreetingLocalDataSource : ILocalDataSource {
    suspend fun getImages(): List<Int>
}