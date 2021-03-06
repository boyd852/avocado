// Generated by Dagger (https://google.github.io/dagger).
package app.doscervezas.avocado.di;

import android.app.Application;
import app.doscervezas.avocado.db.RateDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideRateDatabaseFactory implements Factory<RateDatabase> {
  private final AppModule module;

  private final Provider<Application> appProvider;

  public AppModule_ProvideRateDatabaseFactory(AppModule module, Provider<Application> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public RateDatabase get() {
    return provideInstance(module, appProvider);
  }

  public static RateDatabase provideInstance(AppModule module, Provider<Application> appProvider) {
    return proxyProvideRateDatabase(module, appProvider.get());
  }

  public static AppModule_ProvideRateDatabaseFactory create(
      AppModule module, Provider<Application> appProvider) {
    return new AppModule_ProvideRateDatabaseFactory(module, appProvider);
  }

  public static RateDatabase proxyProvideRateDatabase(AppModule instance, Application app) {
    return Preconditions.checkNotNull(
        instance.provideRateDatabase(app),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
