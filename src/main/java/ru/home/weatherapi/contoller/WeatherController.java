package ru.home.weatherapi.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.home.weatherapi.model.WeatherHistory;
import ru.home.weatherapi.service.WeatherService;

import java.sql.Date;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/wheater")
public class WeatherController {

    private WeatherService weatherService;
//    GetWehaterByDate getWehaterByDate;

    @Autowired
    WeatherController(WeatherService weatherService){
//                      GetWehaterByDate getWehaterByDate) {
        this.weatherService = weatherService;
//        this.getWehaterByDate = getWehaterByDate;
    }

    @GetMapping
    public ResponseEntity getWeather(Date date) {

        return new ResponseEntity(weatherService.getWeather(date), HttpStatus.OK);
    }

}
