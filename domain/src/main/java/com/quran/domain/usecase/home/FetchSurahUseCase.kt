package com.quran.domain.usecase.home

import com.quran.domain.Surah

interface FetchSurahUseCase {
    suspend fun invoke(): List<Surah>
}