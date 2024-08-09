package com.quran.domain.usecase.register

import com.quran.domain.User

interface RegisterValidateInputUseCase {
    suspend fun invoke(
        user: User
    ): Boolean
}