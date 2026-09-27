package com.casemapai.data.repository;

import com.casemapai.domain.prompt.IssueSpotterPromptBuilder;
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
public final class AnalysisRepositoryImpl_Factory implements Factory<AnalysisRepositoryImpl> {
  private final Provider<AiClient> aiClientProvider;

  private final Provider<IssueSpotterPromptBuilder> issueSpotterPromptBuilderProvider;

  public AnalysisRepositoryImpl_Factory(Provider<AiClient> aiClientProvider,
      Provider<IssueSpotterPromptBuilder> issueSpotterPromptBuilderProvider) {
    this.aiClientProvider = aiClientProvider;
    this.issueSpotterPromptBuilderProvider = issueSpotterPromptBuilderProvider;
  }

  @Override
  public AnalysisRepositoryImpl get() {
    return newInstance(aiClientProvider.get(), issueSpotterPromptBuilderProvider.get());
  }

  public static AnalysisRepositoryImpl_Factory create(Provider<AiClient> aiClientProvider,
      Provider<IssueSpotterPromptBuilder> issueSpotterPromptBuilderProvider) {
    return new AnalysisRepositoryImpl_Factory(aiClientProvider, issueSpotterPromptBuilderProvider);
  }

  public static AnalysisRepositoryImpl newInstance(AiClient aiClient,
      IssueSpotterPromptBuilder issueSpotterPromptBuilder) {
    return new AnalysisRepositoryImpl(aiClient, issueSpotterPromptBuilder);
  }
}
