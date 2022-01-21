package ru.home.weatherapi.service;

import ru.home.weatherapi.model.WeatherHistory;

import java.sql.Date;

public interface WeatherService {

    WeatherHistory getWeather(Date date);
}
