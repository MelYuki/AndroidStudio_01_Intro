package be.melyuki.demo01_intro

import android.app.Application
import android.util.Log

class DemoApplication : Application() {


    private val message : String = "Demo App !"

    public fun getMessage() : String {
        return message
    }

    override fun onCreate() {
        super.onCreate()

        Log.d("App TFTIC", "Create")
    }

    override fun onTerminate() {
        super.onTerminate()

        Log.d("App TFTIC", "Terminate")
    }
}