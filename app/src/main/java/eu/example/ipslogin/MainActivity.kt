package eu.example.ipslogin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
            Toast.makeText(this@MainActivity, "welcome", Toast.LENGTH_SHORT).show()
            val intent = Intent(this , Student::class.java)
            startActivity(intent)

        }
    }
}