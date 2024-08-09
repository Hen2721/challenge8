package com.quran.domain.usecase.profile

import com.quran.domain.Profile

interface UpdateProfileUseCase {
    suspend fun invoke(token: String, user: Profile): String
}