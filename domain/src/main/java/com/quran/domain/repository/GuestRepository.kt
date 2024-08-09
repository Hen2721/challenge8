package com.quran.domain.repository

import com.quran.domain.Login
import com.quran.domain.LoginBody
import com.quran.domain.User

interface GuestRepository {
    suspend fun register(user: User): String
    suspend fun login(user: LoginBody): Login
}

