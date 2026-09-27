package com.casemapai.domain.repository;

import com.casemapai.di.SqlConnectDataSource;
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
public final class MatterRepositoryImpl_Factory implements Factory<MatterRepositoryImpl> {
  private final Provider<SqlConnectDataSource> sqlConnectDataSourceProvider;

  public MatterRepositoryImpl_Factory(Provider<SqlConnectDataSource> sqlConnectDataSourceProvider) {
    this.sqlConnectDataSourceProvider = sqlConnectDataSourceProvider;
  }

  @Override
  public MatterRepositoryImpl get() {
    return newInstance(sqlConnectDataSourceProvider.get());
  }

  public static MatterRepositoryImpl_Factory create(
      Provider<SqlConnectDataSource> sqlConnectDataSourceProvider) {
    return new MatterRepositoryImpl_Factory(sqlConnectDataSourceProvider);
  }

  public static MatterRepositoryImpl newInstance(SqlConnectDataSource sqlConnectDataSource) {
    return new MatterRepositoryImpl(sqlConnectDataSource);
  }
}
