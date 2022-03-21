package com.example.cowork.base.data.remote

interface IRemoteRepository<R: IRemoteDataSource> {
    val remoteDataSource: R
}
