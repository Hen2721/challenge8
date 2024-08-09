package com.quran.domain.usecase.profile

import com.quran.domain.Profile

interface FetchProfileUseCase {
    suspend fun invoke(token: String): Profile
}