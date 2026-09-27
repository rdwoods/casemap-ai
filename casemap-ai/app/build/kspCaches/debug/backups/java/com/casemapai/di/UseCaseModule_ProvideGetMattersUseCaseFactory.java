package com.casemapai.di;

import com.casemapai.domain.repository.MatterRepository;
import com.casemapai.domain.usecase.GetMattersUseCase;
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
public final class UseCaseModule_ProvideGetMattersUseCaseFactory implements Factory<GetMattersUseCase> {
  private final Provider<MatterRepository> repositoryProvider;

  public UseCaseModule_ProvideGetMattersUseCaseFactory(
      Provider<MatterRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetMattersUseCase get() {
    return provideGetMattersUseCase(repositoryProvider.get());
  }

  public static UseCaseModule_ProvideGetMattersUseCaseFactory create(
      Provider<MatterRepository> repositoryProvider) {
    return new UseCaseModule_ProvideGetMattersUseCaseFactory(repositoryProvider);
  }

  public static GetMattersUseCase provideGetMattersUseCase(MatterRepository repository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideGetMattersUseCase(repository));
  }
}
