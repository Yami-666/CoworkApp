package com.example.cowork.app

import com.example.cowork.utils.providers.IStringResources
import com.example.cowork.utils.providers.StringResources
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.dsl.module

@Module
@ComponentScan("com.example.cowork.utils.providers")
class ProvidersModule {
    val module = module {
        single<IStringResources> {
            StringResources(get())
        }
    }
}