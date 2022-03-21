package com.example.cowork.features.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cowork.features.greeting.domain.IGetGreetingImagesUseCase
import com.example.cowork.utils.providers.IStringResources
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class GreetingViewModel(
    stringResources: IStringResources,
    private val getGreetingImagesUseCase: IGetGreetingImagesUseCase,
) : ViewModel() {

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
        viewModelScope.launch(Dispatchers.IO) {
            _images.value = getGreetingImagesUseCase()
        }
    }
}