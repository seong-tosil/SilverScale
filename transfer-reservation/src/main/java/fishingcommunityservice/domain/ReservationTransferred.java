package fishingcommunityservice.domain;

import fishingcommunityservice.domain.*;
import fishingcommunityservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ReservationTransferred extends AbstractEvent {

    private String transferId;
    private String bookingId;
    private String transferType;

    public ReservationTransferred(Transfer aggregate) {
        super(aggregate);
    }

    public ReservationTransferred() {
        super();
    }
}
//>>> DDD / Domain Event
