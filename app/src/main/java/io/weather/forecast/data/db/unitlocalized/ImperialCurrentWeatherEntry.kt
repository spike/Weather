package io.weather.forecast.data.db.unitlocalized

import androidx.room.ColumnInfo
import androidx.room.Embedded
import com.google.gson.annotations.SerializedName
import io.weather.forecast.data.db.entity.Condition

data class ImperialCurrentWeatherEntry(
        @ColumnInfo(name = "tempF")
        override val temperature: Double,
        @ColumnInfo(name = "condition_icon")
        override val conditionIconUrl: String,
        @ColumnInfo(name = "condition_text")
        override val conditionText: String,
        @ColumnInfo(name = "windMph")
        override val windSpeed: Double,
        @ColumnInfo(name = "winDir")
        override val windDirection: String,
        @ColumnInfo(name = "precipIn")
        override val precipitationVolume: Double,
        @ColumnInfo(name = "feelslikeF")
        override val feelsLikeTemperature: Double,
        @ColumnInfo(name = "visMiles")
        override val visibilityDistance: Double
        ) : UnitSpecificCurrentWeatherEntry {
}
