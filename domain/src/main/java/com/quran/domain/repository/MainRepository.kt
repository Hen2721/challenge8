package com.quran.domain.repository

import com.quran.domain.Profile
import com.quran.domain.Surah
import com.quran.domain.SurahDetail
import okhttp3.MultipartBody

interface MainRepository {
    suspend fun fetchAllSurahData(): List<Surah>
    suspend fun fetchSurahDetail(noSurah: Int): SurahDetail
    suspend fun fetchProfile(token: String): Profile
    suspend fun updateProfile(token: String, user: Profile): String
    suspend fun uploadProfileImage(token: String, image: MultipartBody.Part): String
}