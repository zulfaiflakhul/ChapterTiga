package aplikasi.serializable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_input.*
import kotlinx.android.synthetic.main.activity_input_data.*
import zulfa.binar.chapter3.R

class InputData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_data)

        hitungIMT()
    }

    fun hitungIMT(){

        but_hitungimt.setOnClickListener {

            val bb = et_BeratBadan.text.toString().toFloat()
            val tb = et_TinggiBadan.text.toString().toFloat()

            val pindah = Intent(this, HasilBmi::class.java)
            val hasil = DataImt(bb,tb)

            pindah.putExtra("DATAIMT", hasil)
            startActivity(pindah)
        }
    }
}