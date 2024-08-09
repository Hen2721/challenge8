package com.quran.presentation.usecase.profile

import com.quran.domain.repository.EditProfileRepository
import com.quran.domain.usecase.profile.LoadProfileImageUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LoadProfileImageUseCase @Inject constructor(
    private val editProfileRepository: EditProfileRepository
): LoadProfileImageUseCase {
    override suspend operator fun invoke(): Flow<String?> {
        return editProfileRepository.loadProfileImage()
    }
}