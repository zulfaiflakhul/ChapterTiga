package zulfa.binar.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_latihan_satu.*

class LatihanSatu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_satu)

        proses.setOnClickListener {

            val nama = input_nama.text.toString()
            val nilai = input_nilai.text.toString()

            text_nama.text = "Nama : $nama"
            text_nilai.text = "Nilai : $nilai"

            if (nilai.toInt() < 60 && nilai.toInt() <= 100){
                text_hasil.text = "Lulus"
            } else {
                text_hasil.text = "Tidak Lulus"
            }

            if (nilai.toInt() < 50 ){
                text_kategori.text = "C"
            } else{
                text_kategori.text = "A"
            }
        }
    }
}