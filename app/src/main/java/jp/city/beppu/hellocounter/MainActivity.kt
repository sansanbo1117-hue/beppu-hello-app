package jp.city.beppu.hellocounter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.tvCount)
        val btn = findViewById<Button>(R.id.btnPlus)

        btn.setOnClickListener {
            count++
            tv.text = count.toString()
        }
    }
}
