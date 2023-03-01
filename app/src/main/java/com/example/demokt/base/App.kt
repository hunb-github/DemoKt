package com.example.demokt.base

import android.app.Application
import com.example.demokt.BuildConfig

class App : Application() {

    companion object {
        var IS_DEBUG = BuildConfig.DEBUG
    }

    override fun onCreate() {
        super.onCreate()
    }

}