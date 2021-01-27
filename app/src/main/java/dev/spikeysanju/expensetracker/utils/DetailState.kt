package dev.spikeysanju.expensetracker.utils

import dev.spikeysanju.expensetracker.model.Transaction

sealed class DetailState {
    object Loading : DetailState()
    data class Success(val transaction: Transaction) : DetailState()
    data class Error(val exception: Throwable) : DetailState()
}