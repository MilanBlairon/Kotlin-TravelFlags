package be.vives.travelflags

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecentlyViewedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recently_viewed)

        val backToMainButton = findViewById<Button>(R.id.backToMainButton)
        backToMainButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val recentlyViewedCountries = RecentlyViewedManager.getRecentlyViewedCountries()
        val recyclerView = findViewById<RecyclerView>(R.id.recentlyViewedList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CountryAdapter(this, recentlyViewedCountries)
    }
}