package com.quran.presentation.usecase.profile

import com.quran.domain.repository.EditProfileRepository
import com.quran.domain.usecase.profile.SaveProfileImageUseCase
import javax.inject.Inject

class SaveProfileImageUseCase @Inject constructor(
    private val editProfileRepository: EditProfileRepository
): SaveProfileImageUseCase {
    override suspend operator fun invoke(profilePhoto: String) {
        editProfileRepository.saveProfileImage(profilePhoto)
    }
}