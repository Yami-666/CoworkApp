package com.example.core.data

import com.example.core.data.local.ILocalDataSource
import com.example.core.data.local.ILocalRepository
import com.example.core.data.remote.IRemoteDataSource
import com.example.core.data.remote.IRemoteRepository

interface IRepository<R : IRemoteDataSource, L : ILocalDataSource> : IRemoteRepository<R>,
    ILocalRepository<L>
