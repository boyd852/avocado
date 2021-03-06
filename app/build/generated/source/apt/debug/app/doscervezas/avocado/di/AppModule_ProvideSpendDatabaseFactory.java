// Generated by Dagger (https://google.github.io/dagger).
package app.doscervezas.avocado.di;

import android.app.Application;
import app.doscervezas.avocado.db.SpendDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideSpendDatabaseFactory implements Factory<SpendDatabase> {
  private final AppModule module;

  private final Provider<Application> appProvider;

  public AppModule_ProvideSpendDatabaseFactory(
      AppModule module, Provider<Application> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public SpendDatabase get() {
    return provideInstance(module, appProvider);
  }

  public static SpendDatabase provideInstance(AppModule module, Provider<Application> appProvider) {
    return proxyProvideSpendDatabase(module, appProvider.get());
  }

  public static AppModule_ProvideSpendDatabaseFactory create(
      AppModule module, Provider<Application> appProvider) {
    return new AppModule_ProvideSpendDatabaseFactory(module, appProvider);
  }

  public static SpendDatabase proxyProvideSpendDatabase(AppModule instance, Application app) {
    return Preconditions.checkNotNull(
        instance.provideSpendDatabase(app),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
