package zulfa.binar.chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_activity_a.*

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity_a)

        but_a.setOnClickListener {

            val datanama = et_nama.text.toString()
            val pindah = Intent(this, ActivityB::class.java)

            pindah.putExtra("nama", datanama)
            pindah.putExtra("datadua", "Nama saya Alien")
            startActivity(pindah)

        }

        but_bundle.setOnClickListener {

            val nama = et_nama.text.toString()
            val pindah = Intent(this, ActivityB::class.java)

            val bund = Bundle()
            bund.putString("datanama", nama)
            pindah.putExtras(bund)
            startActivity(pindah)
        }
    }
}