package fishingcommunityservice.domain;

import fishingcommunityservice.domain.*;
import fishingcommunityservice.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ReservationTransferAccepted extends AbstractEvent {

    private String transferId;
    private String bookingId;
    private String transferType;

    public ReservationTransferAccepted(Transfer aggregate) {
        super(aggregate);
    }

    public ReservationTransferAccepted() {
        super();
    }
}
//>>> DDD / Domain Event
