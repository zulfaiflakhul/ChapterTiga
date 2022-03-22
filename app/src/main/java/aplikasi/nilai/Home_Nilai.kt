package aplikasi.nilai

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hasil_nilai.*
import kotlinx.android.synthetic.main.activity_home_nilai.*
import zulfa.binar.chapter3.ActivityB
import zulfa.binar.chapter3.R

class Home_Nilai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_nilai)

        but_prosesnilai.setOnClickListener {

            val uts = input_uts.text.toString()
            val uas = input_uas.text.toString()
            val tugas = input_tugas.text.toString()
            val namamahasiswa = input_namamhs.text.toString()

            val hasil = Intent(this, HasilNilai::class.java)

            hasil.putExtra("namamhs", namamahasiswa)

            val nilai_total = (uts.toInt() + uas.toInt() + tugas.toInt()) / 3
            hasil.putExtra("nilaitotal", nilai_total.toString())

            if (nilai_total <= 100 && nilai_total >= 90){
                hasil.putExtra("kategori", "A")
            } else if (nilai_total <= 89 && nilai_total >= 70){
                hasil.putExtra("kategori", "B")
            } else if (nilai_total <= 69 && nilai_total >= 60){
                hasil.putExtra("kategori", "C")
            } else if (nilai_total <= 59 && nilai_total >= 0){
                hasil.putExtra("kategori", "D")
            }

            if (nilai_total >= 65){
                hasil.putExtra("keterangan", "LULUS")
            } else {
                hasil.putExtra("keterangan", "TIDAK LULUS")
            }

            startActivity(hasil)
        }
    }
}