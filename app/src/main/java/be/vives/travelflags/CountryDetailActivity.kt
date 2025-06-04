package be.vives.travelflags

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CountryDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country_detail)

        val backToMainButton = findViewById<Button>(R.id.backToMainButton)
        backToMainButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val countryName = intent.getStringExtra("countryName")
        val countryNameTextView = findViewById<TextView>(R.id.countryNameDetail)
        val countryFlagImageView = findViewById<ImageView>(R.id.countryFlag)
        RecentlyViewedManager.addCountry(countryName ?: "")
        countryNameTextView.text = countryName
        // Lijst met vlagnamen die linken naar bijhorende foto's in de map res/drawable
        val flagResId = when (countryName) {
            "België" -> R.drawable.flag_be
            "Frankrijk" -> R.drawable.flag_fr
            "Duitsland" -> R.drawable.flag_de
            "Italië" -> R.drawable.flag_it
            "Spanje" -> R.drawable.flag_es
            // Bij fouten Viveslogo tonen
            else -> R.drawable.logo_vives
        }
        countryFlagImageView.setImageResource(flagResId)
    }
}