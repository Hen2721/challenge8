package com.quran.presentation.usecase.profile

import com.quran.domain.Profile
import com.quran.domain.repository.EditProfileRepository
import com.quran.domain.usecase.profile.ProfileValidateInputUseCase
import javax.inject.Inject

class ProfileValidateInputUseCase @Inject constructor(
    private val editProfileRepository: EditProfileRepository
): ProfileValidateInputUseCase {
    override suspend operator fun invoke(user: Profile): Boolean {
        return editProfileRepository.validateProfileInput(user)
    }
}