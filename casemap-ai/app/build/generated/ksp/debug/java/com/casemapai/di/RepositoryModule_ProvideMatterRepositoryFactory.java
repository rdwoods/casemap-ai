package com.casemapai.di;

import com.casemapai.domain.repository.MatterRepository;
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
public final class RepositoryModule_ProvideMatterRepositoryFactory implements Factory<MatterRepository> {
  private final Provider<SqlConnectDataSource> sqlConnectDataSourceProvider;

  public RepositoryModule_ProvideMatterRepositoryFactory(
      Provider<SqlConnectDataSource> sqlConnectDataSourceProvider) {
    this.sqlConnectDataSourceProvider = sqlConnectDataSourceProvider;
  }

  @Override
  public MatterRepository get() {
    return provideMatterRepository(sqlConnectDataSourceProvider.get());
  }

  public static RepositoryModule_ProvideMatterRepositoryFactory create(
      Provider<SqlConnectDataSource> sqlConnectDataSourceProvider) {
    return new RepositoryModule_ProvideMatterRepositoryFactory(sqlConnectDataSourceProvider);
  }

  public static MatterRepository provideMatterRepository(
      SqlConnectDataSource sqlConnectDataSource) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideMatterRepository(sqlConnectDataSource));
  }
}
