package io.weather.forecast.data.db.unitlocalized

import androidx.room.ColumnInfo

data class MetricCurrentWeatherEntry (
        @ColumnInfo(name = "tempF")
        override val temperature: Double,
        @ColumnInfo(name = "condition_icon")
        override val conditionIconUrl: String,
        @ColumnInfo(name = "condition_text")
        override val conditionText: String,
        @ColumnInfo(name = "windKph")
        override val windSpeed: Double,
        @ColumnInfo(name = "winDir")
        override val windDirection: String,
        @ColumnInfo(name = "precipMm")
        override val precipitationVolume: Double,
        @ColumnInfo(name = "feelslikeC")
        override val feelsLikeTemperature: Double,
        @ColumnInfo(name = "visKm")
        override val visibilityDistance: Double
) : UnitSpecificCurrentWeatherEntry {
}