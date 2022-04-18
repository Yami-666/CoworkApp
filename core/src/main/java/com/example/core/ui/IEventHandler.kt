package com.example.core.ui

interface IEventHandler<E : IEvent> {
    fun obtainEvent(event: E)
}