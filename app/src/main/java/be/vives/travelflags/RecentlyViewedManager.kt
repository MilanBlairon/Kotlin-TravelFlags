package be.vives.travelflags

object RecentlyViewedManager {
    private val recentlyViewedCountries = mutableListOf<String>()

    fun addCountry(country: String) {
        if (!recentlyViewedCountries.contains(country)) {
            recentlyViewedCountries.add(country)
        }
    }

    fun getRecentlyViewedCountries(): List<String> {
        return recentlyViewedCountries
    }
}