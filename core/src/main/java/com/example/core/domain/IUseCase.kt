package com.example.core.domain

import kotlinx.coroutines.flow.Flow

interface IUseCase {
    interface InOut<I, O> {
        suspend operator fun invoke(data: I): O
    }

    interface In<I> {
        suspend operator fun invoke(data: I)
    }

    interface Out<O> {
        suspend operator fun invoke(): O
    }

    interface FlowableInOut<I, O> {
        operator fun invoke(data: I): Flow<O>
    }

    interface FlowableIn<I> {
        operator fun invoke(data: I)
    }

    interface FlowableOut<O> {
        operator fun invoke(): Flow<O>
    }
}