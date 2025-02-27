package fishingcommunityservice.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import fishingcommunityservice.WeatherInfoApplication;
import fishingcommunityservice.domain.WeatherChecked;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Weather_table")
@Data
//<<< DDD / Aggregate Root
public class Weather {

    @Id
    private String weatherId;

    private String location;

    @PostPersist
    public void onPostPersist() {
        WeatherChecked weatherChecked = new WeatherChecked(this);
        weatherChecked.publishAfterCommit();
    }

    public static WeatherRepository repository() {
        WeatherRepository weatherRepository = WeatherInfoApplication.applicationContext.getBean(
            WeatherRepository.class
        );
        return weatherRepository;
    }
}
//>>> DDD / Aggregate Root
