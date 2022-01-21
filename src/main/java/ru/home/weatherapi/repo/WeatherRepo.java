package ru.home.weatherapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.home.weatherapi.model.WeatherHistory;
import ru.home.weatherapi.model.WeatherHistoryId;

import java.sql.Date;

public interface WeatherRepo extends JpaRepository <WeatherHistory, Date> {

    @Query("SELECT w FROM WeatherHistory w WHERE w.weatherDate=?1")
    WeatherHistory getWeatherByDate(Date date);

}
