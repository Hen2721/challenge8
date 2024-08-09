package com.quran.presentation.usecase.surah

import com.quran.domain.SurahDetail
import com.quran.domain.repository.MainRepository
import com.quran.domain.usecase.surah.FetchSurahDetailUseCase
import javax.inject.Inject

class FetchSurahDetailUseCase @Inject constructor(
    private val mainRepository: MainRepository
): FetchSurahDetailUseCase {
    override suspend operator fun invoke(noSurah: Int): SurahDetail {
        return mainRepository.fetchSurahDetail(noSurah)
    }
}