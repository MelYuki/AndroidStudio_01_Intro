package be.melyuki.demo01_intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val TAG = "DemoTFTIC"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "on Create")

        val btn: Button = findViewById(R.id.btn_demo)

        btn.setOnClickListener {
            Log.d(TAG, "Oui")
        }
        // C'est la dernière méthode qui gagne pcq méthode "set"OnClick...
        btn.setOnClickListener {
            Log.d(TAG, "Non")

            // Les différentes possibilités de log
            Log.v(TAG, "Message VERBOSE")
            Log.d(TAG, "Message DEBUG")
            Log.i(TAG, "Message INFO")
            Log.w(TAG, "Message WARNING")
            Log.e(TAG, "Message ERROR")
            Log.wtf(TAG, "Message ASSERT")

            val content = (application as DemoApplication).getMessage()
            val msg : TextView = findViewById(R.id.msg)
            msg.setText(content)

        }
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "on Start")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "on Resume")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "on Pause")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "on Stop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Log.d(TAG, "on SaveInstanceState")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG, "on Restart")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "on Destroy")
    }
}
