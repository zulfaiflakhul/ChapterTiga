package aplikasi.serializable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import zulfa.binar.chapter3.R

class SecondActvity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        /* val dataperson = intent.getSerializableExtra("ANSATU") as Person

        txt_nama.text = dataperson.nama
        txt_umur.text = dataperson.umur.toString()
        txt_alamat.text = dataperson.alamat
        txt_hobi.text = dataperson.hobi

        if (dataperson.umur % 2 == 0){
            txt_nilaiumur.text = "Genap"
        } else {
            txt_nilaiumur.text = "Ganjil"
        } */

        val dataparcelable = intent.getParcelableExtra("ANDUA") as PersonPercelable?
        txt_nama.text = dataparcelable.toString()
    }
}