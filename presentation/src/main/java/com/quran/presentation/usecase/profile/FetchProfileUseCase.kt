package com.quran.presentation.usecase.profile

import com.quran.domain.Profile
import com.quran.domain.repository.MainRepository
import com.quran.domain.usecase.profile.FetchProfileUseCase
import javax.inject.Inject

class FetchProfileUseCase @Inject constructor(
    private val mainRepository: MainRepository
): FetchProfileUseCase {
    override suspend operator fun invoke(token: String): Profile {
        return mainRepository.fetchProfile(token)
    }
}