package io.weather.forecast.data.network.response

import com.google.gson.annotations.SerializedName
import io.weather.forecast.data.db.entity.CurrentWeatherEntry
import io.weather.forecast.data.db.entity.Location


data class CurrentWeatherResponse(
        @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
        val location: Location
)