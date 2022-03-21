package com.example.cowork.features.greeting.data.repository

import com.example.cowork.features.greeting.domain.IGreetingRepository
import org.koin.core.annotation.Singleton

@Singleton
internal class GreetingRepository(
    override val localDataSource: IGreetingLocalDataSource,
) : IGreetingRepository {
    override suspend fun getImages(): List<Int> {
        return localDataSource.getImages()
    }
}