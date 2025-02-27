package fishingcommunityservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class AcceptReservationTransferCommand {

    private String transferId;
    private String bookingId;
    private String transferType;
}
