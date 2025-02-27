package fishingcommunityservice.domain;

import fishingcommunityservice.domain.*;
import fishingcommunityservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ReservationRequestConfirmed extends AbstractEvent {

    private String bookingId;
    private String shipId;
    private String userId;
    private String status;

    public ReservationRequestConfirmed(Booking aggregate) {
        super(aggregate);
    }

    public ReservationRequestConfirmed() {
        super();
    }
}
//>>> DDD / Domain Event
