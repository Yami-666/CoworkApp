package com.example.cowork.features.greeting.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.ui.*
import com.example.cowork.features.greeting.domain.IGetGreetingImagesUseCase
import com.example.cowork.utils.providers.IStringResources
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class GreetingViewModel(
    stringResources: IStringResources,
    private val getGreetingImagesUseCase: IGetGreetingImagesUseCase,
) : ViewModel(), IReducer<GreetingEvent, GreetingState>, IEventHandler<GreetingEvent> {

    private val _uiState = MutableStateFlow<GreetingState>(GreetingState.Initialize)
    val uiState = _uiState.asStateFlow()

    private val _images = MutableStateFlow<List<Int>>(emptyList())
    val images = _images.asStateFlow()

    val titles = listOf(
        stringResources.welcomeToCoworkTitle,
        stringResources.findWorkingSpaceTitle,
        stringResources.createAnEvent,
    )

    val descriptionContents = listOf(
        "Work and organize events with friends outside the office to get rid of boredom",
        "Find coworking space easily and quickly through this application",
        "Create your event by determining the place that has been provided"
    )

    init {
        // FIXME: Удалить потом
        viewModelScope.launch(Dispatchers.IO) {
            _images.value = getGreetingImagesUseCase()
        }
    }

    override fun obtainEvent(event: GreetingEvent) {
        viewModelScope.launch(
            block = {
                _uiState.value = GreetingState.Loading
                _uiState.value = reduce(event, _uiState.value)
            },
            context = CoroutineExceptionHandler { _, throwable ->
                _uiState.value = GreetingState.Error(throwable)
            }
        )
    }

    override suspend fun reduce(event: GreetingEvent, currentState: GreetingState): GreetingState {
        return when (event) {
            is GreetingEvent.GetGreetingPages -> {
                val images = getGreetingImagesUseCase()

                GreetingState.Display(
                    images = images,
                    titles = titles,
                    descriptionContents = descriptionContents,
                )
            }
        }
    }
}