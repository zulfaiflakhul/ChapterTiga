package aplikasi.serializable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hasil.*
import kotlinx.android.synthetic.main.activity_hasil_bmi.*
import kotlinx.android.synthetic.main.activity_main.*
import zulfa.binar.chapter3.R

class HasilBmi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_bmi)

        val data = intent.getSerializableExtra("DATAIMT") as DataImt

        val hasilhitung = data.beratBadan / (data.tinggiBadan * data.tinggiBadan)

        if (hasilhitung < 18.5){
            txt_hasilakhir.text = "Kurus"
        } else if (hasilhitung > 18.5 && hasilhitung < 24.9){
            txt_hasilakhir.text = "Normal"
        } else if (hasilhitung > 25 && hasilhitung < 29.9){
            txt_hasilakhir.text = "Over Weight"
        } else {
            txt_hasilakhir.text = "Obesitas"
        }

        txt_hasilhitung.text = hasilhitung.toString()
        txt_BeratBadan.text = data.beratBadan.toString()
        txt_TinggiBadan.text = data.tinggiBadan.toString()
    }
}