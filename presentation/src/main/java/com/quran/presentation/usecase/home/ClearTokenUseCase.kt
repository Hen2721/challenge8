package com.quran.presentation.usecase.home

import com.quran.domain.repository.HomeRepository
import com.quran.domain.usecase.home.ClearTokenUseCase
import javax.inject.Inject

class ClearTokenUseCase @Inject constructor(
    private val homeRepository: HomeRepository
): ClearTokenUseCase {
    override suspend operator fun invoke() {
        homeRepository.clearToken()
    }
}