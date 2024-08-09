package com.quran.presentation.usecase.login

import com.quran.domain.Login
import com.quran.domain.LoginBody
import com.quran.domain.repository.GuestRepository
import com.quran.domain.usecase.login.LoginUseCase
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val guestRepository: GuestRepository
): LoginUseCase {
    override suspend operator fun invoke(user: LoginBody): Login {
        return guestRepository.login(user)
    }
}