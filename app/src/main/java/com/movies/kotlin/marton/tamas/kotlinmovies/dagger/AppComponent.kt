package com.movies.kotlin.marton.tamas.kotlinmovies.dagger

import com.movies.kotlin.marton.tamas.kotlinmovies.MoviesApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        AppModule::class,
        ActivityBuilder::class))
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance fun application(application: MoviesApplication): Builder
       fun appModule(appModule: AppModule): Builder

        fun build(): AppComponent
    }

    fun inject(app: MoviesApplication)
}