package fishingcommunityservice.domain;

import fishingcommunityservice.domain.*;
import fishingcommunityservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class WeatherChecked extends AbstractEvent {

    private String weatherId;
    private String location;

    public WeatherChecked(Weather aggregate) {
        super(aggregate);
    }

    public WeatherChecked() {
        super();
    }
}
//>>> DDD / Domain Event
