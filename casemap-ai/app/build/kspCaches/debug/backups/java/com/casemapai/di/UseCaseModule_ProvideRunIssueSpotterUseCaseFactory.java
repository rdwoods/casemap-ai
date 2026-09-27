package com.casemapai.di;

import com.casemapai.domain.repository.AnalysisRepository;
import com.casemapai.domain.usecase.RunIssueSpotterUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class UseCaseModule_ProvideRunIssueSpotterUseCaseFactory implements Factory<RunIssueSpotterUseCase> {
  private final Provider<AnalysisRepository> repositoryProvider;

  public UseCaseModule_ProvideRunIssueSpotterUseCaseFactory(
      Provider<AnalysisRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public RunIssueSpotterUseCase get() {
    return provideRunIssueSpotterUseCase(repositoryProvider.get());
  }

  public static UseCaseModule_ProvideRunIssueSpotterUseCaseFactory create(
      Provider<AnalysisRepository> repositoryProvider) {
    return new UseCaseModule_ProvideRunIssueSpotterUseCaseFactory(repositoryProvider);
  }

  public static RunIssueSpotterUseCase provideRunIssueSpotterUseCase(
      AnalysisRepository repository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideRunIssueSpotterUseCase(repository));
  }
}
