package com.quran.domain.usecase.login

import com.quran.domain.Login
import com.quran.domain.LoginBody

interface LoginUseCase {
    suspend fun invoke(
        user: LoginBody
    ): Login
}