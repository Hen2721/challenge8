package com.quran.presentation.usecase.login

import com.quran.domain.repository.LoginRepository
import com.quran.domain.usecase.login.SetTokenUseCase
import javax.inject.Inject

class SetTokenUseCase @Inject constructor(
    private val loginRepository: LoginRepository
): SetTokenUseCase {
    override suspend operator fun invoke(token: String) {
        loginRepository.setToken(token)
    }
}