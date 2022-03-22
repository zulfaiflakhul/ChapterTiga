package zulfa.binar.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_latihan_dua.*

class LatihanDua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_dua)

        val x = angka_satu.text
        val y = angka_dua.text

        but_tambah.setOnClickListener {

            val hasil = x.toString().toInt() + y.toString().toInt()
            text_hasil.text = hasil.toString()
        }

        but_kurang.setOnClickListener {

            val hasil = x.toString().toInt() - y.toString().toInt()
            text_hasil.text = hasil.toString()
        }

        but_kali.setOnClickListener {

            val hasil = x.toString().toInt() * y.toString().toInt()
            text_hasil.text = hasil.toString()
        }

        but_bagi.setOnClickListener {

            val hasil = x.toString().toFloat() / y.toString().toFloat()
            text_hasil.text = hasil.toString()
        }

        but_reset.setOnClickListener {
            angka_satu.editableText.clear()
            angka_dua.editableText.clear()
            text_hasil.text = ""
        }
    }
}