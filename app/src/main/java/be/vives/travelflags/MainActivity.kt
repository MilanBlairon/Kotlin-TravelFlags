package be.vives.travelflags

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countries = listOf("België", "Frankrijk", "Duitsland", "Italië", "Spanje")
        val recyclerView = findViewById<RecyclerView>(R.id.countryList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CountryAdapter(this, countries)
        val recentlyViewedButton = findViewById<Button>(R.id.recentlyViewedButton)
        recentlyViewedButton.setOnClickListener {
            val intent = Intent(this, RecentlyViewedActivity::class.java)
            startActivity(intent)
        }
    }
}
