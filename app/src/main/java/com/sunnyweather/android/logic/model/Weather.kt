package com.sunnyweather.android.logic.model

data class Weather(val realtime: RealTimeResponse.RealTime, val daily: DailyResponse.Daily) {
}