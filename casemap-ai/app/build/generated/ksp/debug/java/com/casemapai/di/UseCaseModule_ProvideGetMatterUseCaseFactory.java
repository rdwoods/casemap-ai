package com.casemapai.di;

import com.casemapai.domain.repository.MatterRepository;
import com.casemapai.domain.usecase.GetMatterUseCase;
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
public final class UseCaseModule_ProvideGetMatterUseCaseFactory implements Factory<GetMatterUseCase> {
  private final Provider<MatterRepository> repositoryProvider;

  public UseCaseModule_ProvideGetMatterUseCaseFactory(
      Provider<MatterRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetMatterUseCase get() {
    return provideGetMatterUseCase(repositoryProvider.get());
  }

  public static UseCaseModule_ProvideGetMatterUseCaseFactory create(
      Provider<MatterRepository> repositoryProvider) {
    return new UseCaseModule_ProvideGetMatterUseCaseFactory(repositoryProvider);
  }

  public static GetMatterUseCase provideGetMatterUseCase(MatterRepository repository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideGetMatterUseCase(repository));
  }
}
