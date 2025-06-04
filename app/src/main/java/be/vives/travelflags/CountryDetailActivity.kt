package be.vives.travelflags

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CountryDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_country_detail)

        val countryName = intent.getStringExtra("countryName")
        val countryNameTextView = findViewById<TextView>(R.id.countryNameDetail)
        val countryFlagImageView = findViewById<ImageView>(R.id.countryFlag)

        countryNameTextView.text = countryName
        // Lijst met vlagnamen die linken naar bijhorende foto's in de map res/drawable
        val flagResId = when (countryName) {
            "Belgium" -> R.drawable.flag_be
            "France" -> R.drawable.flag_fr
            "Germany" -> R.drawable.flag_de
            "Italy" -> R.drawable.flag_it
            "Spain" -> R.drawable.flag_es
            else -> R.drawable.logo_vives
        }
        countryFlagImageView.setImageResource(flagResId)
    }
}