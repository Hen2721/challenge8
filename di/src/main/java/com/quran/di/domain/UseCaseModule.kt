package com.quran.di.domain

import androidx.work.WorkManager
import com.quran.domain.repository.EditProfileRepository
import com.quran.domain.repository.GuestRepository
import com.quran.domain.repository.HomeRepository
import com.quran.domain.repository.LoginRepository
import com.quran.domain.repository.MainRepository
import com.quran.domain.repository.RegisterRepository
import com.quran.presentation.usecase.home.ClearTokenUseCase
import com.quran.presentation.usecase.home.FetchSurahUseCase
import com.quran.presentation.usecase.login.GetTokenUseCase
import com.quran.presentation.usecase.login.LoginUseCase
import com.quran.presentation.usecase.profile.ApplyBlurUseCase
import com.quran.presentation.usecase.login.SetTokenUseCase
import com.quran.presentation.usecase.login.LoginValidateInputUseCase
import com.quran.presentation.usecase.profile.FetchProfileUseCase
import com.quran.presentation.usecase.profile.LoadProfileImageUseCase
import com.quran.presentation.usecase.profile.ProfileImageValidateUseCase
import com.quran.presentation.usecase.profile.ProfileValidateInputUseCase
import com.quran.presentation.usecase.profile.SaveProfileImageUseCase
import com.quran.presentation.usecase.profile.UpdateProfileUseCase
import com.quran.presentation.usecase.profile.UploadProfileImageUseCase
import com.quran.presentation.usecase.register.RegisterUseCase
import com.quran.presentation.usecase.register.RegisterValidateInputUseCase
import com.quran.presentation.usecase.surah.FetchSurahDetailUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Singleton
    @Provides
    fun provideApplyBlurUseCase(
        workManager: WorkManager
    ): ApplyBlurUseCase {
        return ApplyBlurUseCase(workManager)
    }

    @Singleton
    @Provides
    fun provideLoginUseCase(
        guestRepository: GuestRepository
    ): LoginUseCase {
        return LoginUseCase(guestRepository)
    }

    @Singleton
    @Provides
    fun provideRegisterUseCase(
        guestRepository: GuestRepository
    ): RegisterUseCase {
        return RegisterUseCase(guestRepository)
    }

    @Singleton
    @Provides
    fun provideValidateInputUseCase(
        loginRepository: LoginRepository
    ): LoginValidateInputUseCase {
        return LoginValidateInputUseCase(loginRepository)
    }

    @Singleton
    @Provides
    fun provideSetTokenUseCase(
        loginRepository: LoginRepository
    ): SetTokenUseCase {
        return SetTokenUseCase(loginRepository)
    }

    @Singleton
    @Provides
    fun provideGetTokenUseCase(
        loginRepository: LoginRepository
    ): GetTokenUseCase {
        return GetTokenUseCase(loginRepository)
    }

    @Singleton
    @Provides
    fun provideClearTokenUseCase(
        homeRepository: HomeRepository
    ): ClearTokenUseCase {
        return ClearTokenUseCase(homeRepository)
    }

    @Singleton
    @Provides
    fun provideRegisterValidateInputUseCase(
        registerRepository: RegisterRepository
    ): RegisterValidateInputUseCase {
        return RegisterValidateInputUseCase(registerRepository)
    }

    @Singleton
    @Provides
    fun provideFetchSurahUseCase(
        mainRepository: MainRepository
    ): FetchSurahUseCase {
        return FetchSurahUseCase(mainRepository)
    }

    @Singleton
    @Provides
    fun provideFetchSurahDetailUseCase(
        mainRepository: MainRepository
    ): FetchSurahDetailUseCase {
        return FetchSurahDetailUseCase(mainRepository)
    }

    @Singleton
    @Provides
    fun provideFetchProfileUseCase(
        mainRepository: MainRepository
    ): FetchProfileUseCase {
        return FetchProfileUseCase(mainRepository)
    }

    @Singleton
    @Provides
    fun provideUpdateProfileUseCase(
        mainRepository: MainRepository
    ): UpdateProfileUseCase {
        return UpdateProfileUseCase(mainRepository)
    }

    @Singleton
    @Provides
    fun provideUploadProfileImageUseCase(
        mainRepository: MainRepository
    ): UploadProfileImageUseCase {
        return UploadProfileImageUseCase(mainRepository)
    }

    @Singleton
    @Provides
    fun provideProfileValidateInputUseCase(
        editProfileRepository: EditProfileRepository
    ): ProfileValidateInputUseCase {
        return ProfileValidateInputUseCase(editProfileRepository)
    }

    @Singleton
    @Provides
    fun provideProfileImageValidateUseCase(
        editProfileRepository: EditProfileRepository
    ): ProfileImageValidateUseCase {
        return ProfileImageValidateUseCase(editProfileRepository)
    }

    @Singleton
    @Provides
    fun provideSaveProfileImageUseCase(
        editProfileRepository: EditProfileRepository
    ): SaveProfileImageUseCase {
        return SaveProfileImageUseCase(editProfileRepository)
    }

    @Singleton
    @Provides
    fun provideLoadProfileImageUseCase(
        editProfileRepository: EditProfileRepository
    ): LoadProfileImageUseCase {
        return LoadProfileImageUseCase(editProfileRepository)
    }
}