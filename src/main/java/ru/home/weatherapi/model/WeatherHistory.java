package ru.home.weatherapi.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.io.SerializablePermission;
import java.sql.Date;

@Entity
@Table(name = "weather_history")
@Data
public class WeatherHistory {

    @EmbeddedId
    private WeatherHistoryId weatherHistoryId;

    @Column(name = "weather_date", updatable = false, insertable = false)
    private Date weatherDate;

    @Column(name = "weather_name", updatable = false, insertable = false)
    private String weatherName;

    @Data
    @Embeddable
    private static class WeatherHistoryId implements Serializable {

        private Date date;
        private String name;

    }


}
