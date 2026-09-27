package com.casemapai.di;

import com.casemapai.domain.repository.MatterRepository;
import com.casemapai.domain.usecase.SaveMatterUseCase;
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
public final class UseCaseModule_ProvideSaveMatterUseCaseFactory implements Factory<SaveMatterUseCase> {
  private final Provider<MatterRepository> repositoryProvider;

  public UseCaseModule_ProvideSaveMatterUseCaseFactory(
      Provider<MatterRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SaveMatterUseCase get() {
    return provideSaveMatterUseCase(repositoryProvider.get());
  }

  public static UseCaseModule_ProvideSaveMatterUseCaseFactory create(
      Provider<MatterRepository> repositoryProvider) {
    return new UseCaseModule_ProvideSaveMatterUseCaseFactory(repositoryProvider);
  }

  public static SaveMatterUseCase provideSaveMatterUseCase(MatterRepository repository) {
    return Preconditions.checkNotNullFromProvides(UseCaseModule.INSTANCE.provideSaveMatterUseCase(repository));
  }
}
