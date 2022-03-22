package aplikasi.wisata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web.*
import kotlinx.android.synthetic.main.activity_web_view.*
import zulfa.binar.chapter3.R

class Web : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        web_wisata.loadUrl("https://borobudurpark.com/temple/prambanan/")
    }
}