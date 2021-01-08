package io.weather.forecast.data.db.entity


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

const val CURRENT_WEATHER_ID = 0

@Entity(tableName = "current_weather")
data class CurrentWeatherEntry(
        @Embedded(prefix="condition_")
        val condition: Condition,
        @SerializedName("is_day")
        val isDay: Int,
        @SerializedName("precip_in")
        val precipIn: Double,
        @SerializedName("precip_mm")
        val precipMm: Double,
        @SerializedName("temp_c")
        val tempC: Double,
        @SerializedName("temp_f")
        val tempF: Double,
        @SerializedName("vis_km")
        val visKm: Double,
        @SerializedName("vis_miles")
        val visMiles: Double,
        @SerializedName("feelslike_f")
        val feellikeF: Double,
        @SerializedName("feelslike_c")
        val feellikeC: Double,
        @SerializedName("wind_kph")
        val windKph: Double,
        @SerializedName("wind_mph")
        val windMph: Double,
        @SerializedName("wind_dir")
        val windDir: Double
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = CURRENT_WEATHER_ID
}