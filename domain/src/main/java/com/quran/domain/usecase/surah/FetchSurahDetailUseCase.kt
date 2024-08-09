package com.quran.domain.usecase.surah

import com.quran.domain.SurahDetail

interface FetchSurahDetailUseCase {
    suspend fun invoke(noSurah: Int): SurahDetail
}