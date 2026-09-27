package com.casemapai.data.repository;

import com.casemapai.data.service.GeminiApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class GeminiAiClient_Factory implements Factory<GeminiAiClient> {
  private final Provider<GeminiApiService> apiProvider;

  private final Provider<ApiKeyProvider> apiKeyProvider;

  public GeminiAiClient_Factory(Provider<GeminiApiService> apiProvider,
      Provider<ApiKeyProvider> apiKeyProvider) {
    this.apiProvider = apiProvider;
    this.apiKeyProvider = apiKeyProvider;
  }

  @Override
  public GeminiAiClient get() {
    return newInstance(apiProvider.get(), apiKeyProvider.get());
  }

  public static GeminiAiClient_Factory create(Provider<GeminiApiService> apiProvider,
      Provider<ApiKeyProvider> apiKeyProvider) {
    return new GeminiAiClient_Factory(apiProvider, apiKeyProvider);
  }

  public static GeminiAiClient newInstance(GeminiApiService api, ApiKeyProvider apiKeyProvider) {
    return new GeminiAiClient(api, apiKeyProvider);
  }
}
