package com.example.cowork.base.data

import com.example.cowork.base.data.local.ILocalDataSource
import com.example.cowork.base.data.local.ILocalRepository
import com.example.cowork.base.data.remote.IRemoteDataSource
import com.example.cowork.base.data.remote.IRemoteRepository

interface IRepository<R : IRemoteDataSource, L : ILocalDataSource> : IRemoteRepository<R>,
    ILocalRepository<L>
