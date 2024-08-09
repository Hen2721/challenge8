package com.quran.domain.repository

interface HomeRepository {
    suspend fun clearToken()
}