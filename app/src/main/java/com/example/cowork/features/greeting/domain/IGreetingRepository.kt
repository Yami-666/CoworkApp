package com.example.cowork.features.greeting.domain

import com.example.core.data.local.ILocalRepository
import com.example.cowork.features.greeting.data.repository.IGreetingLocalDataSource

interface IGreetingRepository : com.example.core.data.local.ILocalRepository<IGreetingLocalDataSource> {
    suspend fun getImages(): List<Int>
}