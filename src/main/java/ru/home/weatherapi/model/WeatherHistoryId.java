package ru.home.weatherapi.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Date;

@Embeddable
public class WeatherHistoryId {

        @Column(name = "weather_Date")
        private Date weatherDate;

        @Column(name = "weatherName")
        private String weatherName;

}
