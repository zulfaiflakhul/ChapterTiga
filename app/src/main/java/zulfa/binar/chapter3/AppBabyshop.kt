package zulfa.binar.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_app_babyshop.*
import kotlinx.android.synthetic.main.activity_latihan_dua.*

class AppBabyshop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_babyshop)

        val namapembeli = nama_pembeli.text.toString()
        val judulbuku = judul_buku.text.toString()
        val jumlahbuku = jumlah.text
        val hargabuku = harga.text
        val uangbayar = uang.text

        button_proses.setOnClickListener {
            val totalbelanja = hargabuku.toString().toInt() * jumlahbuku.toString().toInt()
            val uangkembali = uangbayar.toString().toInt() - totalbelanja

            if (totalbelanja > 70000){
                text_bonus.text = "Bonus : Keyboard"
            } else {
                text_bonus.text = "Bonus : Mouse"
            }

            text_total.text = "Total Belanja : $totalbelanja"
            text_uangkembali.text = "Uang Kembali : $uangkembali"
            text_keterangan.text = "Keterangan : Tunggu Kembalian"
        }

        reset.setOnClickListener {
            nama_pembeli.editableText.clear()
            judul_buku.editableText.clear()
            jumlah.editableText.clear()
            harga.editableText.clear()
            uang.editableText.clear()
        }
    }
}