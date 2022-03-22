package aplikasi.serializable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*
import zulfa.binar.chapter3.R

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        //ParsingSerializable()
        parsingParcelable()
    }

    fun ParsingSerializable(){

        but_serializable.setOnClickListener {

            val pindah = Intent(this, SecondActvity::class.java)
            val dataperson = Person("Zulfa", 20, "Cilacap", "Sepak Bola")

            pindah.putExtra("ANSATU",dataperson)
            startActivity(pindah)
        }
    }

    fun parsingParcelable(){

        but_parcelable.setOnClickListener {

            val pindah = Intent(this, SecondActvity::class.java)
            val dataperson = PersonPercelable("Zulfa", "asasa@asas.com")

            pindah.putExtra("ANDUA", dataperson)
        }
    }
}