package io.weather.forecast.data.response

import com.google.gson.annotations.SerializedName
import io.weather.forecast.data.db.CurrentWeatherEntry
import io.weather.forecast.data.db.Location


data class CurrentWeatherResponse(
        @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
        val location: Location
)