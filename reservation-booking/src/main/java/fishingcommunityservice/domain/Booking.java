package fishingcommunityservice.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import fishingcommunityservice.ReservationBookingApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Booking_table")
@Data
//<<< DDD / Aggregate Root
public class Booking {

    @Id
    private String bookingId;

    private String shipId;

    private String userId;

    private String status;

    private statusType statusType;

    public static BookingRepository repository() {
        BookingRepository bookingRepository = ReservationBookingApplication.applicationContext.getBean(
            BookingRepository.class
        );
        return bookingRepository;
    }

    //<<< Clean Arch / Port Method
    public void confirmReservationRequest(
        ConfirmReservationRequestCommand confirmReservationRequestCommand
    ) {
        //implement business logic here:

        ReservationRequestConfirmed reservationRequestConfirmed = new ReservationRequestConfirmed(
            this
        );
        reservationRequestConfirmed.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void completeReservation(
        CompleteReservationCommand completeReservationCommand
    ) {
        //implement business logic here:

        ReservationCompleted reservationCompleted = new ReservationCompleted(
            this
        );
        reservationCompleted.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
