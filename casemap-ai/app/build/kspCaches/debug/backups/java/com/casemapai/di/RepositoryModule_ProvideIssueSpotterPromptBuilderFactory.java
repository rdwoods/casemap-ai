package com.casemapai.di;

import com.casemapai.domain.prompt.IssueSpotterPromptBuilder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class RepositoryModule_ProvideIssueSpotterPromptBuilderFactory implements Factory<IssueSpotterPromptBuilder> {
  @Override
  public IssueSpotterPromptBuilder get() {
    return provideIssueSpotterPromptBuilder();
  }

  public static RepositoryModule_ProvideIssueSpotterPromptBuilderFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static IssueSpotterPromptBuilder provideIssueSpotterPromptBuilder() {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideIssueSpotterPromptBuilder());
  }

  private static final class InstanceHolder {
    static final RepositoryModule_ProvideIssueSpotterPromptBuilderFactory INSTANCE = new RepositoryModule_ProvideIssueSpotterPromptBuilderFactory();
  }
}
