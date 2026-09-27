package com.casemapai.di;

import com.casemapai.data.repository.AiClient;
import com.casemapai.domain.prompt.IssueSpotterPromptBuilder;
import com.casemapai.domain.repository.AnalysisRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class RepositoryModule_ProvideAnalysisRepositoryFactory implements Factory<AnalysisRepository> {
  private final Provider<AiClient> aiClientProvider;

  private final Provider<IssueSpotterPromptBuilder> promptBuilderProvider;

  public RepositoryModule_ProvideAnalysisRepositoryFactory(Provider<AiClient> aiClientProvider,
      Provider<IssueSpotterPromptBuilder> promptBuilderProvider) {
    this.aiClientProvider = aiClientProvider;
    this.promptBuilderProvider = promptBuilderProvider;
  }

  @Override
  public AnalysisRepository get() {
    return provideAnalysisRepository(aiClientProvider.get(), promptBuilderProvider.get());
  }

  public static RepositoryModule_ProvideAnalysisRepositoryFactory create(
      Provider<AiClient> aiClientProvider,
      Provider<IssueSpotterPromptBuilder> promptBuilderProvider) {
    return new RepositoryModule_ProvideAnalysisRepositoryFactory(aiClientProvider, promptBuilderProvider);
  }

  public static AnalysisRepository provideAnalysisRepository(AiClient aiClient,
      IssueSpotterPromptBuilder promptBuilder) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideAnalysisRepository(aiClient, promptBuilder));
  }
}
