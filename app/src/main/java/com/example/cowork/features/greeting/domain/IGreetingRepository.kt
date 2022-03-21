package com.example.cowork.features.greeting.domain

import com.example.cowork.base.data.local.ILocalRepository
import com.example.cowork.features.greeting.data.repository.IGreetingLocalDataSource

interface IGreetingRepository : ILocalRepository<IGreetingLocalDataSource> {
    suspend fun getImages(): List<Int>
}