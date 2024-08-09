package com.quran.domain.repository

import com.quran.domain.Profile
import kotlinx.coroutines.flow.Flow
import okhttp3.MultipartBody

interface EditProfileRepository {
    suspend fun validateProfileInput(user: Profile): Boolean
    suspend fun validateProfileImage(image: MultipartBody.Part): Boolean
    suspend fun loadProfileImage(): Flow<String?>
    suspend fun saveProfileImage(profilePhoto: String)
}