package com.example.cowork.features.greeting.presentation

import com.example.core.ui.IEvent
import com.example.core.ui.IState

sealed class GreetingEvent : IEvent {
    object GetGreetingPages : GreetingEvent()
}

sealed class GreetingState : IState {
    object Initialize : GreetingState()
    object Loading : GreetingState()
    data class Error(
        val throwable: Throwable
    ) : GreetingState()

    data class Display(
        val images: List<Int>,
        val titles: List<String>,
        val descriptionContents: List<String>,
    ): GreetingState()
}