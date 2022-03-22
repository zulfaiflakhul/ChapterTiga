package zulfa.binar.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        but_proses.setOnClickListener {
            val angka1 = angkasatu.text.toString()
            val angka2 = angkadua.text.toString()

            val jumlah = angka1.toInt() + angka2.toInt()

            hasil.text = jumlah.toString()
        }
    }
}