package com.quran.di.domain

import com.quran.data.local.LocalRepository
import com.quran.data.remote.RemoteRepository
import com.quran.domain.repository.EditProfileRepository
import com.quran.domain.repository.GuestRepository
import com.quran.domain.repository.HomeRepository
import com.quran.domain.repository.LoginRepository
import com.quran.domain.repository.MainRepository
import com.quran.domain.repository.RegisterRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {
    @Singleton
    @Provides
    fun provideMainRepository(
        remoteRepository: RemoteRepository
    ): MainRepository {
        return remoteRepository
    }

    @Singleton
    @Provides
    fun provideGuestRepository(
        remoteRepository: RemoteRepository
    ): GuestRepository {
        return remoteRepository
    }

    @Singleton
    @Provides
    fun provideLoginRepository(
        localRepository: LocalRepository
    ): LoginRepository {
        return localRepository
    }

    @Singleton
    @Provides
    fun provideRegisterRepository(
        localRepository: LocalRepository
    ): RegisterRepository {
        return localRepository
    }

    @Singleton
    @Provides
    fun provideHomeRepository(
        localRepository: LocalRepository
    ): HomeRepository {
        return localRepository
    }

    @Singleton
    @Provides
    fun provideEditProfileRepository(
        localRepository: LocalRepository
    ): EditProfileRepository {
        return localRepository
    }
}