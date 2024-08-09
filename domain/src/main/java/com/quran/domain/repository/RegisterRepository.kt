package com.quran.domain.repository

import com.quran.domain.User


interface RegisterRepository {
    suspend fun validateInput(user: User): Boolean
}