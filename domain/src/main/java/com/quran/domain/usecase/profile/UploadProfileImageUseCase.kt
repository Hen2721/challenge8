package com.quran.domain.usecase.profile

import okhttp3.MultipartBody

interface UploadProfileImageUseCase {
    suspend fun invoke(token: String, image: MultipartBody.Part): String
}