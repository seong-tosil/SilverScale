package fishingcommunityservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CompleteReservationCommand {

    private String bookingId;
}
