package com.quran.presentation.usecase.home

import com.quran.domain.Surah
import com.quran.domain.repository.MainRepository
import com.quran.domain.usecase.home.FetchSurahUseCase
import javax.inject.Inject

class FetchSurahUseCase @Inject constructor(
    private val mainRepository: MainRepository
): FetchSurahUseCase {
    override suspend operator fun invoke(): List<Surah> {
        return mainRepository.fetchAllSurahData()
    }
}