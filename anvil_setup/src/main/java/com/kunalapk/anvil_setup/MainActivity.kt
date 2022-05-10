package com.kunalapk.anvil_setup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kunalapk.anvil_setup.utils.Beautifier
import com.kunalapk.anvil_setup.utils.TimeUtils
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var beautifier: Beautifier

    @Inject
    lateinit var timeUtils: TimeUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Toast.makeText(this,beautifier.getName("Kunal"),Toast.LENGTH_LONG).show()

        Toast.makeText(this,timeUtils.getCurrentTimeInMilliseconds(),Toast.LENGTH_LONG).show()
    }
}