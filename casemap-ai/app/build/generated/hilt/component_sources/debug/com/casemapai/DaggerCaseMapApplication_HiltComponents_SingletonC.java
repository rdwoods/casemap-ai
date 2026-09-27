package com.casemapai;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.casemapai.data.repository.AiClient;
import com.casemapai.data.repository.ApiKeyProvider;
import com.casemapai.data.repository.GeminiAiClient;
import com.casemapai.data.repository.GeminiApiKeyProviderImpl;
import com.casemapai.data.service.GeminiApiService;
import com.casemapai.dataconnect.GetUserQuery;
import com.casemapai.di.NetworkModule_ProvideFirebaseRemoteConfigFactory;
import com.casemapai.di.NetworkModule_ProvideGeminiApiServiceFactory;
import com.casemapai.di.NetworkModule_ProvideHttpCacheFactory;
import com.casemapai.di.NetworkModule_ProvideHttpLoggingInterceptorFactory;
import com.casemapai.di.NetworkModule_ProvideMoshiFactory;
import com.casemapai.di.NetworkModule_ProvideOkHttpClientFactory;
import com.casemapai.di.NetworkModule_ProvideRetrofitFactory;
import com.casemapai.di.RepositoryModule_ProvideAnalysisRepositoryFactory;
import com.casemapai.di.RepositoryModule_ProvideIssueSpotterPromptBuilderFactory;
import com.casemapai.di.RepositoryModule_ProvideMatterRepositoryFactory;
import com.casemapai.di.SqlConnectDataSource;
import com.casemapai.di.UseCaseModule_ProvideGetMatterUseCaseFactory;
import com.casemapai.di.UseCaseModule_ProvideGetMattersUseCaseFactory;
import com.casemapai.di.UseCaseModule_ProvideRunIssueSpotterUseCaseFactory;
import com.casemapai.di.UseCaseModule_ProvideSaveMatterUseCaseFactory;
import com.casemapai.di.UserModule_ProvideUserFactory;
import com.casemapai.domain.prompt.IssueSpotterPromptBuilder;
import com.casemapai.domain.repository.AnalysisRepository;
import com.casemapai.domain.repository.MatterRepository;
import com.casemapai.domain.usecase.GetMatterUseCase;
import com.casemapai.domain.usecase.GetMattersUseCase;
import com.casemapai.domain.usecase.RunIssueSpotterUseCase;
import com.casemapai.domain.usecase.SaveMatterUseCase;
import com.casemapai.ui.analysis.AnalysisViewModel;
import com.casemapai.ui.analysis.AnalysisViewModel_HiltModules;
import com.casemapai.ui.analysis.AnalysisViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.casemapai.ui.analysis.AnalysisViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.casemapai.ui.home.HomeViewModel;
import com.casemapai.ui.home.HomeViewModel_HiltModules;
import com.casemapai.ui.home.HomeViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.casemapai.ui.home.HomeViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.casemapai.ui.matter.EditMatterViewModel;
import com.casemapai.ui.matter.EditMatterViewModel_HiltModules;
import com.casemapai.ui.matter.EditMatterViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.casemapai.ui.matter.EditMatterViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.casemapai.ui.matter.MatterDetailViewModel;
import com.casemapai.ui.matter.MatterDetailViewModel_HiltModules;
import com.casemapai.ui.matter.MatterDetailViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.casemapai.ui.matter.MatterDetailViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.squareup.moshi.Moshi;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.LazyClassKeyMap;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

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
public final class DaggerCaseMapApplication_HiltComponents_SingletonC {
  private DaggerCaseMapApplication_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public CaseMapApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements CaseMapApplication_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private SavedStateHandleHolder savedStateHandleHolder;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ActivityRetainedCBuilder savedStateHandleHolder(
        SavedStateHandleHolder savedStateHandleHolder) {
      this.savedStateHandleHolder = Preconditions.checkNotNull(savedStateHandleHolder);
      return this;
    }

    @Override
    public CaseMapApplication_HiltComponents.ActivityRetainedC build() {
      Preconditions.checkBuilderRequirement(savedStateHandleHolder, SavedStateHandleHolder.class);
      return new ActivityRetainedCImpl(singletonCImpl, savedStateHandleHolder);
    }
  }

  private static final class ActivityCBuilder implements CaseMapApplication_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public CaseMapApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements CaseMapApplication_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public CaseMapApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements CaseMapApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public CaseMapApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements CaseMapApplication_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public CaseMapApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements CaseMapApplication_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public CaseMapApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements CaseMapApplication_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public CaseMapApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends CaseMapApplication_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends CaseMapApplication_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    FragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends CaseMapApplication_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends CaseMapApplication_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    ActivityCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity mainActivity) {
    }

    @Override
    public void injectMainActivity(com.casemapai.app.MainActivity mainActivity) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Map<Class<?>, Boolean> getViewModelKeys() {
      return LazyClassKeyMap.<Boolean>of(ImmutableMap.<String, Boolean>of(AnalysisViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, AnalysisViewModel_HiltModules.KeyModule.provide(), EditMatterViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, EditMatterViewModel_HiltModules.KeyModule.provide(), HomeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, HomeViewModel_HiltModules.KeyModule.provide(), MatterDetailViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, MatterDetailViewModel_HiltModules.KeyModule.provide()));
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends CaseMapApplication_HiltComponents.ViewModelC {
    private final SavedStateHandle savedStateHandle;

    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    Provider<AnalysisViewModel> analysisViewModelProvider;

    Provider<EditMatterViewModel> editMatterViewModelProvider;

    Provider<HomeViewModel> homeViewModelProvider;

    Provider<MatterDetailViewModel> matterDetailViewModelProvider;

    ViewModelCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        SavedStateHandle savedStateHandleParam, ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.savedStateHandle = savedStateHandleParam;
      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.analysisViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.editMatterViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.homeViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.matterDetailViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
    }

    @Override
    public Map<Class<?>, javax.inject.Provider<ViewModel>> getHiltViewModelMap() {
      return LazyClassKeyMap.<javax.inject.Provider<ViewModel>>of(ImmutableMap.<String, javax.inject.Provider<ViewModel>>of(AnalysisViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (analysisViewModelProvider)), EditMatterViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (editMatterViewModelProvider)), HomeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (homeViewModelProvider)), MatterDetailViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (matterDetailViewModelProvider))));
    }

    @Override
    public Map<Class<?>, Object> getHiltViewModelAssistedMap() {
      return ImmutableMap.<Class<?>, Object>of();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.casemapai.ui.analysis.AnalysisViewModel
          return (T) new AnalysisViewModel(viewModelCImpl.savedStateHandle, singletonCImpl.getMatterUseCase(), singletonCImpl.runIssueSpotterUseCase());

          case 1: // com.casemapai.ui.matter.EditMatterViewModel
          return (T) new EditMatterViewModel(singletonCImpl.saveMatterUseCase(), singletonCImpl.provideUserProvider.get());

          case 2: // com.casemapai.ui.home.HomeViewModel
          return (T) new HomeViewModel(singletonCImpl.getMattersUseCase());

          case 3: // com.casemapai.ui.matter.MatterDetailViewModel
          return (T) new MatterDetailViewModel(viewModelCImpl.savedStateHandle, singletonCImpl.getMatterUseCase(), singletonCImpl.runIssueSpotterUseCase());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends CaseMapApplication_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    ActivityRetainedCImpl(SingletonCImpl singletonCImpl,
        SavedStateHandleHolder savedStateHandleHolderParam) {
      this.singletonCImpl = singletonCImpl;

      initialize(savedStateHandleHolderParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandleHolder savedStateHandleHolderParam) {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends CaseMapApplication_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends CaseMapApplication_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    Provider<SqlConnectDataSource> sqlConnectDataSourceProvider;

    Provider<MatterRepository> provideMatterRepositoryProvider;

    Provider<Moshi> provideMoshiProvider;

    Provider<Cache> provideHttpCacheProvider;

    Provider<HttpLoggingInterceptor> provideHttpLoggingInterceptorProvider;

    Provider<FirebaseRemoteConfig> provideFirebaseRemoteConfigProvider;

    Provider<OkHttpClient> provideOkHttpClientProvider;

    Provider<Retrofit> provideRetrofitProvider;

    Provider<GeminiApiService> provideGeminiApiServiceProvider;

    Provider<GeminiApiKeyProviderImpl> geminiApiKeyProviderImplProvider;

    Provider<ApiKeyProvider> bindGeminiApiKeyProvider;

    Provider<GeminiAiClient> geminiAiClientProvider;

    Provider<AiClient> bindAiClientProvider;

    Provider<IssueSpotterPromptBuilder> provideIssueSpotterPromptBuilderProvider;

    Provider<AnalysisRepository> provideAnalysisRepositoryProvider;

    Provider<GetUserQuery.Data.User> provideUserProvider;

    SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);

    }

    GetMatterUseCase getMatterUseCase() {
      return UseCaseModule_ProvideGetMatterUseCaseFactory.provideGetMatterUseCase(provideMatterRepositoryProvider.get());
    }

    RunIssueSpotterUseCase runIssueSpotterUseCase() {
      return UseCaseModule_ProvideRunIssueSpotterUseCaseFactory.provideRunIssueSpotterUseCase(provideAnalysisRepositoryProvider.get());
    }

    SaveMatterUseCase saveMatterUseCase() {
      return UseCaseModule_ProvideSaveMatterUseCaseFactory.provideSaveMatterUseCase(provideMatterRepositoryProvider.get());
    }

    GetMattersUseCase getMattersUseCase() {
      return UseCaseModule_ProvideGetMattersUseCaseFactory.provideGetMattersUseCase(provideMatterRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.sqlConnectDataSourceProvider = DoubleCheck.provider(new SwitchingProvider<SqlConnectDataSource>(singletonCImpl, 1));
      this.provideMatterRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<MatterRepository>(singletonCImpl, 0));
      this.provideMoshiProvider = DoubleCheck.provider(new SwitchingProvider<Moshi>(singletonCImpl, 6));
      this.provideHttpCacheProvider = DoubleCheck.provider(new SwitchingProvider<Cache>(singletonCImpl, 8));
      this.provideHttpLoggingInterceptorProvider = DoubleCheck.provider(new SwitchingProvider<HttpLoggingInterceptor>(singletonCImpl, 9));
      this.provideFirebaseRemoteConfigProvider = DoubleCheck.provider(new SwitchingProvider<FirebaseRemoteConfig>(singletonCImpl, 10));
      this.provideOkHttpClientProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonCImpl, 7));
      this.provideRetrofitProvider = DoubleCheck.provider(new SwitchingProvider<Retrofit>(singletonCImpl, 5));
      this.provideGeminiApiServiceProvider = DoubleCheck.provider(new SwitchingProvider<GeminiApiService>(singletonCImpl, 4));
      this.geminiApiKeyProviderImplProvider = new SwitchingProvider<>(singletonCImpl, 11);
      this.bindGeminiApiKeyProvider = DoubleCheck.provider((Provider) (geminiApiKeyProviderImplProvider));
      this.geminiAiClientProvider = new SwitchingProvider<>(singletonCImpl, 3);
      this.bindAiClientProvider = DoubleCheck.provider((Provider) (geminiAiClientProvider));
      this.provideIssueSpotterPromptBuilderProvider = DoubleCheck.provider(new SwitchingProvider<IssueSpotterPromptBuilder>(singletonCImpl, 12));
      this.provideAnalysisRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<AnalysisRepository>(singletonCImpl, 2));
      this.provideUserProvider = DoubleCheck.provider(new SwitchingProvider<GetUserQuery.Data.User>(singletonCImpl, 13));
    }

    @Override
    public void injectCaseMapApplication(CaseMapApplication caseMapApplication) {
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return ImmutableSet.<Boolean>of();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.casemapai.domain.repository.MatterRepository
          return (T) RepositoryModule_ProvideMatterRepositoryFactory.provideMatterRepository(singletonCImpl.sqlConnectDataSourceProvider.get());

          case 1: // com.casemapai.di.SqlConnectDataSource
          return (T) new SqlConnectDataSource();

          case 2: // com.casemapai.domain.repository.AnalysisRepository
          return (T) RepositoryModule_ProvideAnalysisRepositoryFactory.provideAnalysisRepository(singletonCImpl.bindAiClientProvider.get(), singletonCImpl.provideIssueSpotterPromptBuilderProvider.get());

          case 3: // com.casemapai.data.repository.GeminiAiClient
          return (T) new GeminiAiClient(singletonCImpl.provideGeminiApiServiceProvider.get(), singletonCImpl.bindGeminiApiKeyProvider.get());

          case 4: // com.casemapai.data.service.GeminiApiService
          return (T) NetworkModule_ProvideGeminiApiServiceFactory.provideGeminiApiService(singletonCImpl.provideRetrofitProvider.get());

          case 5: // retrofit2.Retrofit
          return (T) NetworkModule_ProvideRetrofitFactory.provideRetrofit(singletonCImpl.provideMoshiProvider.get(), singletonCImpl.provideOkHttpClientProvider.get());

          case 6: // com.squareup.moshi.Moshi
          return (T) NetworkModule_ProvideMoshiFactory.provideMoshi();

          case 7: // okhttp3.OkHttpClient
          return (T) NetworkModule_ProvideOkHttpClientFactory.provideOkHttpClient(singletonCImpl.provideHttpCacheProvider.get(), singletonCImpl.provideHttpLoggingInterceptorProvider.get(), singletonCImpl.provideFirebaseRemoteConfigProvider.get());

          case 8: // okhttp3.Cache
          return (T) NetworkModule_ProvideHttpCacheFactory.provideHttpCache(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 9: // okhttp3.logging.HttpLoggingInterceptor
          return (T) NetworkModule_ProvideHttpLoggingInterceptorFactory.provideHttpLoggingInterceptor();

          case 10: // @javax.inject.Named("remoteConfig") com.google.firebase.remoteconfig.FirebaseRemoteConfig
          return (T) NetworkModule_ProvideFirebaseRemoteConfigFactory.provideFirebaseRemoteConfig();

          case 11: // com.casemapai.data.repository.GeminiApiKeyProviderImpl
          return (T) new GeminiApiKeyProviderImpl(singletonCImpl.provideFirebaseRemoteConfigProvider.get());

          case 12: // com.casemapai.domain.prompt.IssueSpotterPromptBuilder
          return (T) RepositoryModule_ProvideIssueSpotterPromptBuilderFactory.provideIssueSpotterPromptBuilder();

          case 13: // com.casemapai.dataconnect.GetUserQuery.Data.User
          return (T) UserModule_ProvideUserFactory.provideUser();

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
