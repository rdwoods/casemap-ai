package com.casemapai.ui.analysis;

import androidx.lifecycle.SavedStateHandle;
import com.casemapai.domain.usecase.GetMatterUseCase;
import com.casemapai.domain.usecase.RunIssueSpotterUseCase;
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
public final class AnalysisViewModel_Factory implements Factory<AnalysisViewModel> {
  private final Provider<SavedStateHandle> savedStateHandleProvider;

  private final Provider<GetMatterUseCase> getMatterUseCaseProvider;

  private final Provider<RunIssueSpotterUseCase> runIssueSpotterUseCaseProvider;

  public AnalysisViewModel_Factory(Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<GetMatterUseCase> getMatterUseCaseProvider,
      Provider<RunIssueSpotterUseCase> runIssueSpotterUseCaseProvider) {
    this.savedStateHandleProvider = savedStateHandleProvider;
    this.getMatterUseCaseProvider = getMatterUseCaseProvider;
    this.runIssueSpotterUseCaseProvider = runIssueSpotterUseCaseProvider;
  }

  @Override
  public AnalysisViewModel get() {
    return newInstance(savedStateHandleProvider.get(), getMatterUseCaseProvider.get(), runIssueSpotterUseCaseProvider.get());
  }

  public static AnalysisViewModel_Factory create(
      Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<GetMatterUseCase> getMatterUseCaseProvider,
      Provider<RunIssueSpotterUseCase> runIssueSpotterUseCaseProvider) {
    return new AnalysisViewModel_Factory(savedStateHandleProvider, getMatterUseCaseProvider, runIssueSpotterUseCaseProvider);
  }

  public static AnalysisViewModel newInstance(SavedStateHandle savedStateHandle,
      GetMatterUseCase getMatterUseCase, RunIssueSpotterUseCase runIssueSpotterUseCase) {
    return new AnalysisViewModel(savedStateHandle, getMatterUseCase, runIssueSpotterUseCase);
  }
}
