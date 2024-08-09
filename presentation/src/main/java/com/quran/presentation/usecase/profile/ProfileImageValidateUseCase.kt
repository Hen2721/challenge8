package com.quran.presentation.usecase.profile

import com.quran.domain.repository.EditProfileRepository
import com.quran.domain.usecase.profile.ProfileImageValidateUseCase
import okhttp3.MultipartBody
import javax.inject.Inject

class ProfileImageValidateUseCase @Inject constructor(
    private val editProfileRepository: EditProfileRepository
): ProfileImageValidateUseCase {
    override suspend operator fun invoke(image: MultipartBody.Part): Boolean {
        return editProfileRepository.validateProfileImage(image)
    }
}