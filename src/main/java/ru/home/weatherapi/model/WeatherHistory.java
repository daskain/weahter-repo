package ru.home.weatherapi.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "weather_history")
@Data
public class WeatherHistory {

//    @EmbeddedId
//    private WeatherHistoryId weatherHistoryId;

    @Id
    @Column(name = "weather_date")
    private Date weatherDate;

    @Column(name = "weather_name")
    private String weatherName;


}
