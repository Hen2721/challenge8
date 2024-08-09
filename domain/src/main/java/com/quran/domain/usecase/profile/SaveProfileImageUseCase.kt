package com.quran.domain.usecase.profile

interface SaveProfileImageUseCase {
    suspend fun invoke(
        profilePhoto: String
    )
}