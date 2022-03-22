package aplikasi.serializable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hasil.*
import zulfa.binar.chapter3.R
import java.util.*

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val data = intent.getSerializableExtra("ANDUA") as data
        val hasilhitung = data.panjang * data.lebar

        text_hasilluas.text = hasilhitung.toString()
    }
}