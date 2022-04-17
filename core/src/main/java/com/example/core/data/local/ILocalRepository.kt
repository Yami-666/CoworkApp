package com.example.core.data.local

interface ILocalRepository<L : ILocalDataSource> {
    val localDataSource: L
}
