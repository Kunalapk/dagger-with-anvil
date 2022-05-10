package com.kunalapk.anvil_setup.module

import com.kunalapk.anvil_setup.utils.Beautifier
import dagger.Module
import dagger.Provides

@Module
class ApiModule {

    @Provides
    fun provideBeautifier(): Beautifier {
        return Beautifier()
    }

}