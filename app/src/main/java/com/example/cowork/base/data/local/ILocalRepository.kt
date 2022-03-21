package com.example.cowork.base.data.local

interface ILocalRepository<L : ILocalDataSource> {
    val localDataSource: L
}
