package io.weather.forecast.data.db.entity


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

const val METRIC_CURRENT_WEATHER_ID = 0

@Entity(tableName = "current_weather")
data class MetricCurrentWeatherEntry(
        @Embedded(prefix="condition_")
        val condition: Condition,
        @SerializedName("is_day")
        val isDay: Int,
        @SerializedName("precip_mm")
        val precipMm: Double,
        @SerializedName("temp_c")
        val tempC: Double,
        @SerializedName("vis_km")
        val visKm: Double,
        @SerializedName("wind_kph")
        val windKph: Double
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = METRIC_CURRENT_WEATHER_ID
}