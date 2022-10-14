package id.kotlin.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var IsiNama : EditText
    lateinit var happy   : Button
    lateinit var sad     : Button
    lateinit var mad     : Button
    lateinit var Judul   : TextView
    lateinit var Design  : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        happy = findViewById(R.id.btn_happy)
        sad = findViewById(R.id.btn_sad)
        mad = findViewById(R.id.btn_mad)
        IsiNama = findViewById(R.id.et_name)
        Judul = findViewById(R.id.txt_name)

        sad.setOnClickListener{
            if (IsiNama.text.length<1) {
                Toast.makeText(this, "Please Input Your Name First!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "Hi " + IsiNama.text + " You are sad today", Toast.LENGTH_SHORT).show()
        }

        mad.setOnClickListener{
            if (IsiNama.text.length<1) {
                Toast.makeText(this, "Please Input Your Name First!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "Hi " + IsiNama.text + " You are mad today", Toast.LENGTH_SHORT).show()
        }

        happy.setOnClickListener{
            if (IsiNama.text.length<1) {
                Toast.makeText(this, "Please Input Your Name First!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "Hi " + IsiNama.text + " You are happy today", Toast.LENGTH_SHORT).show()
        }
    }
}