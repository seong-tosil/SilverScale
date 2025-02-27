package fishingcommunityservice.domain;

import fishingcommunityservice.domain.*;
import fishingcommunityservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ReservationCompleted extends AbstractEvent {

    private String bookingId;
    private String shipId;
    private String userId;
    private String status;

    public ReservationCompleted(Booking aggregate) {
        super(aggregate);
    }

    public ReservationCompleted() {
        super();
    }
}
//>>> DDD / Domain Event
