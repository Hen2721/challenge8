package com.quran.presentation.usecase.register

import com.quran.domain.User
import com.quran.domain.repository.RegisterRepository
import com.quran.domain.usecase.register.RegisterValidateInputUseCase
import javax.inject.Inject

class RegisterValidateInputUseCase @Inject constructor(
    private val registerRepository: RegisterRepository
): RegisterValidateInputUseCase {
    override suspend operator fun invoke(user: User): Boolean {
        return registerRepository.validateInput(user)
    }
}