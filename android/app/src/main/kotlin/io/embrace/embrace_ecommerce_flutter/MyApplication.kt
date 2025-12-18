package io.embrace.embrace_ecommerce_flutter

import android.app.Application
import io.embrace.android.embracesdk.Embrace

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Embrace.getInstance().start(this)
    }
}