package com.quran.presentation.usecase.profile

import com.quran.domain.Profile
import com.quran.domain.repository.MainRepository
import com.quran.domain.usecase.profile.UpdateProfileUseCase
import javax.inject.Inject

class UpdateProfileUseCase @Inject constructor(
    private val mainRepository: MainRepository
): UpdateProfileUseCase {
    override suspend operator fun invoke(token: String, user: Profile): String {
        return mainRepository.updateProfile(token, user)
    }
}