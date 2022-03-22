package aplikasi.wisata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_beranda.*
import kotlinx.android.synthetic.main.activity_web_view.*
import zulfa.binar.chapter3.Home
import zulfa.binar.chapter3.R

class Beranda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)

        but_home.setOnClickListener{
            startActivity(Intent(this, Home_Wisata::class.java))
        }

        but_profile.setOnClickListener {
            startActivity(Intent(this, Profile::class.java))
        }

        but_web.setOnClickListener {
            startActivity(Intent(this, Web::class.java))
        }

        but_logout.setOnClickListener {
            finish()
        }
    }
}