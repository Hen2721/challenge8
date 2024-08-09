package com.quran.domain.usecase.profile

import com.quran.domain.Profile

interface ProfileValidateInputUseCase {
    suspend fun invoke(
        user: Profile
    ): Boolean
}