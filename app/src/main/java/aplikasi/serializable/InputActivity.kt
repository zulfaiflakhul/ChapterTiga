package aplikasi.serializable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_input.*
import zulfa.binar.chapter3.R

class InputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        hitungLuas()
    }

    fun hitungLuas(){

        but_hitung.setOnClickListener {

            val panjang = et_panjang.text.toString().toInt()
            val lebar = et_lebar.text.toString().toInt()

            val pindah = Intent(this, HasilActivity::class.java)
            val hasil = data(panjang,lebar)

            pindah.putExtra("ANDUA", hasil)
            startActivity(pindah)
        }
    }
}