package com.quran.data.remote.service

import com.quran.data.remote.response.GetAllSurahDetailResponse
import com.quran.data.remote.response.GetAllSurahResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface QuranService {
    @GET("surah")
    suspend fun getAllSurah(): GetAllSurahResponse

    @GET("surah/{noSurah}/editions/ar.alafasy,en.transliteration,id.indonesian")
    suspend fun getSurahByNumber(@Path("noSurah") noSurah: Int): GetAllSurahDetailResponse
}