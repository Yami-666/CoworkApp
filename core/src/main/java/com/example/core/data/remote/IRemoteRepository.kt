package com.example.core.data.remote

interface IRemoteRepository<R: IRemoteDataSource> {
    val remoteDataSource: R
}
