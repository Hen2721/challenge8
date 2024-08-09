package com.quran.domain.usecase.login

interface SetTokenUseCase {
    suspend fun invoke(
        token: String
    )
}