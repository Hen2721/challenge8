package com.quran.presentation.usecase.register

import com.quran.domain.User
import com.quran.domain.repository.GuestRepository
import com.quran.domain.usecase.register.RegisterUseCase
import javax.inject.Inject

class RegisterUseCase @Inject constructor(
    private val guestRepository: GuestRepository
): RegisterUseCase {
    override suspend operator fun invoke(user: User): String {
        return guestRepository.register(user)
    }
}