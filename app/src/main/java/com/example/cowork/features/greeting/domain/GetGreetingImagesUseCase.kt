package com.example.cowork.features.greeting.domain

import com.example.cowork.base.domain.IUseCase
import org.koin.core.annotation.Factory

@Factory
internal class GetGreetingImagesUseCase(
    private val greetingRepository: IGreetingRepository,
) : IGetGreetingImagesUseCase {
    override suspend fun invoke(): List<Int> {
        return greetingRepository.getImages()
    }
}

interface IGetGreetingImagesUseCase : IUseCase.Out<List<Int>>