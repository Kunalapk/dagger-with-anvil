package com.kunalapk.dagger_setup.module

import com.kunalapk.dagger_setup.utils.Beautifier
import dagger.Module
import dagger.Provides

@Module
class ApiModule {

    @Provides
    fun provideBeautifier():Beautifier{
        return Beautifier()
    }
}