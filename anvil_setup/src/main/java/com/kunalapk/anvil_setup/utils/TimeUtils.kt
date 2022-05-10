package com.kunalapk.anvil_setup.utils

import javax.inject.Inject


class TimeUtils @Inject constructor() {

    fun getCurrentTimeInMilliseconds():String{
        return "Current time in millisecond ${System.currentTimeMillis()}"
    }
}