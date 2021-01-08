package io.weather.forecast.data.db.entity


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

const val IMPERIAL_CURRENT_WEATHER_ID = 0

@Entity(tableName = "current_weather")
data class ImperialCurrentWeatherEntry(
        @Embedded(prefix="condition_")
        val condition: Condition,
        @SerializedName("is_day")
        val isDay: Int,
        @SerializedName("precip_in")
        val precipIn: Double,
        @SerializedName("temp_f")
        val tempF: Double,
        @SerializedName("vis_miles")
        val visMiles: Double,
        @SerializedName("wind_mph")
        val windMph: Double
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = IMPERIAL_CURRENT_WEATHER_ID
}