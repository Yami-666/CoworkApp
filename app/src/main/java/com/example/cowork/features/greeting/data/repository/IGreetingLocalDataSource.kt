package com.example.cowork.features.greeting.data.repository

import com.example.cowork.base.data.local.ILocalDataSource

interface IGreetingLocalDataSource : ILocalDataSource{
    suspend fun getImages(): List<Int>
}