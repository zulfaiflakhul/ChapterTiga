package zulfa.binar.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lifecycle.*

class ActivityLifecycle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)

        textlifecycle.text = "\n OnCreate"
    }

    override fun onStart() {
        super.onStart()
        textlifecycle.text = "\n OnStart"
    }

    override fun onResume() {
        super.onResume()
        textlifecycle.text = "\n OnResume"
    }

    override fun onPause() {
        super.onPause()
        textlifecycle.text = "\n OnPause"
    }

    override fun onStop() {
        super.onStop()
        textlifecycle.text = "\n OnStop"
    }
}