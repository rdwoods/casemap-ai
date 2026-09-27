package com.casemapai.data.repository

import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import javax.inject.Inject
import javax.inject.Named

class GeminiApiKeyProviderImpl @Inject constructor(
    @param:Named("remoteConfig") private val remoteConfig: FirebaseRemoteConfig
) : ApiKeyProvider {

    override suspend fun getApiKey(): String {
        return remoteConfig.getString("app_api_key")
    }
}
