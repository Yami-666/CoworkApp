package com.example.cowork.features.greeting.data.repository

import com.example.core.data.local.ILocalDataSource

interface IGreetingLocalDataSource : com.example.core.data.local.ILocalDataSource {
    suspend fun getImages(): List<Int>
}