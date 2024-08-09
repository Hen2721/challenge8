package com.quran.domain.usecase.register

import com.quran.domain.User

interface RegisterUseCase {
    suspend fun invoke(
        user: User
    ): String
}