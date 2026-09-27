package com.casemapai.data.repository

interface ApiKeyProvider {
    suspend fun getApiKey(): String
}