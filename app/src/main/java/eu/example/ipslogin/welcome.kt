package eu.example.ipslogin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.widget.ImageView
import android.widget.Toast

class welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val back=findViewById<ImageView>(R.id.backButton)
        back.setOnClickListener{
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(30)
            finish()
        }

        val login=findViewById<ImageView>(R.id.roundblue)
        login.setOnClickListener(){
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(50)
            Toast.makeText(this@welcome, "not coded further", Toast.LENGTH_SHORT).show()
        }
    }
}