package com.kunalapk.anvil_setup.module

import com.kunalapk.anvil_setup.scopes.AppScope
import com.kunalapk.anvil_setup.utils.TimeUtils
import com.kunalapk.anvil_setup.scopes.SingleIn
import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides

@Module
@ContributesTo(AppScope::class)
class TimeUtilsModule {

    @SingleIn(AppScope::class)
    @Provides
    fun provideTimeUtils() = TimeUtils()
}