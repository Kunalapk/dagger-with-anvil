package com.kunalapk.dagger_setup.component

import android.app.Application
import com.kunalapk.dagger_setup.application.AppController
import com.kunalapk.dagger_setup.module.ActivityModule
import com.kunalapk.dagger_setup.module.ApiModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
            ApiModule::class,
            ActivityModule::class,
            AndroidSupportInjectionModule::class]
)
interface AppComponent: AndroidInjector<DaggerApplication> {

    override fun inject(instance: DaggerApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(appController: AppController)
}