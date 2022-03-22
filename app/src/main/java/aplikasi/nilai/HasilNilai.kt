package aplikasi.nilai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hasil_nilai.*
import zulfa.binar.chapter3.R

class HasilNilai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_nilai)

        val nama_mahasiswa = intent.getStringExtra("namamhs")
        val nilai_mahasiswa = intent.getStringExtra("nilaitotal")
        val nilai_huruf = intent.getStringExtra("kategori")
        val keterangan = intent.getStringExtra("keterangan")

        namamhs.text = nama_mahasiswa
        nilaimhs.text = nilai_mahasiswa
        nilaihuruf.text = nilai_huruf
        keteranganlulus.text = keterangan
    }
}