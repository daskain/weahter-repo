package ru.home.weatherapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.home.weatherapi.model.WeatherHistory;
import ru.home.weatherapi.repo.WeatherRepo;

import java.sql.Date;

@Service
public class WeatherServiceImpl implements WeatherService {

    private WeatherRepo weatherRepo;

    @Autowired
    WeatherServiceImpl(WeatherRepo weatherRepo) {
        this.weatherRepo = weatherRepo;
    }

    @Override
    public WeatherHistory getWeather(Date date) {
        return weatherRepo.getWeatherByDate(date);
    }
}
