package com.casemapai.ui.matter;

import com.casemapai.dataconnect.GetUserQuery;
import com.casemapai.domain.usecase.SaveMatterUseCase;
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
public final class EditMatterViewModel_Factory implements Factory<EditMatterViewModel> {
  private final Provider<SaveMatterUseCase> saveMatterUseCaseProvider;

  private final Provider<GetUserQuery.Data.User> currentUserProvider;

  public EditMatterViewModel_Factory(Provider<SaveMatterUseCase> saveMatterUseCaseProvider,
      Provider<GetUserQuery.Data.User> currentUserProvider) {
    this.saveMatterUseCaseProvider = saveMatterUseCaseProvider;
    this.currentUserProvider = currentUserProvider;
  }

  @Override
  public EditMatterViewModel get() {
    return newInstance(saveMatterUseCaseProvider.get(), currentUserProvider.get());
  }

  public static EditMatterViewModel_Factory create(
      Provider<SaveMatterUseCase> saveMatterUseCaseProvider,
      Provider<GetUserQuery.Data.User> currentUserProvider) {
    return new EditMatterViewModel_Factory(saveMatterUseCaseProvider, currentUserProvider);
  }

  public static EditMatterViewModel newInstance(SaveMatterUseCase saveMatterUseCase,
      GetUserQuery.Data.User currentUser) {
    return new EditMatterViewModel(saveMatterUseCase, currentUser);
  }
}
