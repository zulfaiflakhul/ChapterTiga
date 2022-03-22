package zulfa.binar.chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        but_login.setOnClickListener {

            val username = et_username.text.toString()
            val password = et_password.text.toString()

            if (username == "admin" && password == "123"){

                startActivity(Intent(this, Home::class.java))
            }else{
                text_login.text = "Username dan Password Salah"
            }
        }
    }
}