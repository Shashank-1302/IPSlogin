package eu.example.ipslogin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val FacultyButton=findViewById<Button>(R.id.FaulctyButton)
        val studentButton=findViewById<Button>(R.id.StudentButton)
        studentButton.setOnClickListener(){
            val intent = Intent(this , welcome::class.java)
            startActivity(intent)
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(50)
            Toast.makeText(this@MainActivity, "enter your Computer code and password", Toast.LENGTH_SHORT).show()

        }
        FacultyButton.setOnClickListener(){
            val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            vibratorService.vibrate(50)
            Toast.makeText(this@MainActivity, "Faculty not yet prepared", Toast.LENGTH_SHORT).show()


        }
    }
}