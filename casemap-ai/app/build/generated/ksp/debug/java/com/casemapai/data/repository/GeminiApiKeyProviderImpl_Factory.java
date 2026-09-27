package com.casemapai.data.repository;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata("javax.inject.Named")
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
public final class GeminiApiKeyProviderImpl_Factory implements Factory<GeminiApiKeyProviderImpl> {
  private final Provider<FirebaseRemoteConfig> remoteConfigProvider;

  public GeminiApiKeyProviderImpl_Factory(Provider<FirebaseRemoteConfig> remoteConfigProvider) {
    this.remoteConfigProvider = remoteConfigProvider;
  }

  @Override
  public GeminiApiKeyProviderImpl get() {
    return newInstance(remoteConfigProvider.get());
  }

  public static GeminiApiKeyProviderImpl_Factory create(
      Provider<FirebaseRemoteConfig> remoteConfigProvider) {
    return new GeminiApiKeyProviderImpl_Factory(remoteConfigProvider);
  }

  public static GeminiApiKeyProviderImpl newInstance(FirebaseRemoteConfig remoteConfig) {
    return new GeminiApiKeyProviderImpl(remoteConfig);
  }
}
