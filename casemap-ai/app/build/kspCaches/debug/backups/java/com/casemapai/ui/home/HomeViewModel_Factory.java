package com.casemapai.ui.home;

import com.casemapai.domain.usecase.GetMattersUseCase;
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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<GetMattersUseCase> getMattersUseCaseProvider;

  public HomeViewModel_Factory(Provider<GetMattersUseCase> getMattersUseCaseProvider) {
    this.getMattersUseCaseProvider = getMattersUseCaseProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(getMattersUseCaseProvider.get());
  }

  public static HomeViewModel_Factory create(
      Provider<GetMattersUseCase> getMattersUseCaseProvider) {
    return new HomeViewModel_Factory(getMattersUseCaseProvider);
  }

  public static HomeViewModel newInstance(GetMattersUseCase getMattersUseCase) {
    return new HomeViewModel(getMattersUseCase);
  }
}
