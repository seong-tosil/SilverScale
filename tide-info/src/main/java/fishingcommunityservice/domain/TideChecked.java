package fishingcommunityservice.domain;

import fishingcommunityservice.domain.*;
import fishingcommunityservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class TideChecked extends AbstractEvent {

    private String tideId;
    private String location;

    public TideChecked(Tide aggregate) {
        super(aggregate);
    }

    public TideChecked() {
        super();
    }
}
//>>> DDD / Domain Event
