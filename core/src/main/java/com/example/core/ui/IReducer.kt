package com.example.core.ui

interface IReducer<E : IEvent, S : IState> {
    suspend fun reduce(event: E, currentState: S): S
}

