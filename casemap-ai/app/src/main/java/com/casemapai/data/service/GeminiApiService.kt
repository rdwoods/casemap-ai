package com.casemapai.data.service

import com.casemapai.data.remote.dto.GeminiGenerateContentRequestDto
import com.casemapai.data.remote.dto.GeminiGenerateContentResponseDto
import com.casemapai.data.remote.dto.GeminiResponseDto
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

interface GeminiApiService {

    @POST("v1/models/gemini-pro:generateContent")
    suspend fun generateContent(
        @Query("key") apiKey: String,
        @Body request: GeminiGenerateContentRequestDto
    ): GeminiGenerateContentResponseDto
}