package be.melyuki.demo01_intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MelvinActivity : AppCompatActivity() {

    private val TAG = "DemoMel"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_melvin)

        val btn2: Button = findViewById(R.id.btn_demo2)

        btn2.setOnClickListener{

            Log.i(TAG, "Go to MainView")
            setContentView(R.layout.activity_main)
            Log.i(TAG, "SUCCESS MainView")

        }

    }
}