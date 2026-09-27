package com.casemapai.data.repository

import com.casemapai.data.remote.dto.GeminiContentDto
import com.casemapai.data.remote.dto.GeminiGenerateContentRequestDto
import com.casemapai.data.remote.dto.GeminiPartDto
import com.casemapai.data.service.GeminiApiService
import com.casemapai.domain.model.AiProvider
import javax.inject.Inject

class GeminiAiClient @Inject constructor(
    private val api: GeminiApiService,
    private val apiKeyProvider: ApiKeyProvider
) : AiClient {

    override suspend fun analyze(prompt: String): AiResponse {
        val dto = api.generateContent(
            apiKey = apiKeyProvider.getApiKey(),
            request = GeminiGenerateContentRequestDto(
                contents = listOf(
                    GeminiContentDto(
                        parts = listOf(GeminiPartDto(prompt))
                    )
                )
            )
        )

        return AiResponse(
            body = dto.extractText(),
            provider = AiProvider.GEMINI,
            modelName = "gemini-2.5-flash"
        )
    }
}