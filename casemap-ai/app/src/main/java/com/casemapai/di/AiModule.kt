package com.casemapai.di

import com.casemapai.data.repository.AiClient
import com.casemapai.data.repository.ApiKeyProvider
import com.casemapai.data.repository.GeminiAiClient
import com.casemapai.data.repository.GeminiApiKeyProviderImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AiModule {

    @Binds
    @Singleton
    abstract fun bindAiClient(
        impl: GeminiAiClient
    ): AiClient

    @Binds
    @Singleton
    abstract fun bindGeminiApiKeyProvider(
        impl: GeminiApiKeyProviderImpl
    ): ApiKeyProvider
}