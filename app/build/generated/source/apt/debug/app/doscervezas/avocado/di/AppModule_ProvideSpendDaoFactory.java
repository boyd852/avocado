// Generated by Dagger (https://google.github.io/dagger).
package app.doscervezas.avocado.di;

import app.doscervezas.avocado.db.SpendDatabase;
import app.doscervezas.avocado.db.dao.SpendDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideSpendDaoFactory implements Factory<SpendDao> {
  private final AppModule module;

  private final Provider<SpendDatabase> spendDatabaseProvider;

  public AppModule_ProvideSpendDaoFactory(
      AppModule module, Provider<SpendDatabase> spendDatabaseProvider) {
    this.module = module;
    this.spendDatabaseProvider = spendDatabaseProvider;
  }

  @Override
  public SpendDao get() {
    return provideInstance(module, spendDatabaseProvider);
  }

  public static SpendDao provideInstance(
      AppModule module, Provider<SpendDatabase> spendDatabaseProvider) {
    return proxyProvideSpendDao(module, spendDatabaseProvider.get());
  }

  public static AppModule_ProvideSpendDaoFactory create(
      AppModule module, Provider<SpendDatabase> spendDatabaseProvider) {
    return new AppModule_ProvideSpendDaoFactory(module, spendDatabaseProvider);
  }

  public static SpendDao proxyProvideSpendDao(AppModule instance, SpendDatabase spendDatabase) {
    return Preconditions.checkNotNull(
        instance.provideSpendDao(spendDatabase),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}