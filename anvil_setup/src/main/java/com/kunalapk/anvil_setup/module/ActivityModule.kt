package com.kunalapk.anvil_setup.module

import com.kunalapk.anvil_setup.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [ApiModule::class])
    abstract fun contributeMainActivity(): MainActivity
}