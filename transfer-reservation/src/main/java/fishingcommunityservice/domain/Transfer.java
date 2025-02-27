package fishingcommunityservice.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import fishingcommunityservice.TransferReservationApplication;
import fishingcommunityservice.domain.ReservationTransferred;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Transfer_table")
@Data
//<<< DDD / Aggregate Root
public class Transfer {

    @Id
    private String transferId;

    private String bookingId;

    private String transferType;

    private transferTypeType transferTypeType;

    @PostPersist
    public void onPostPersist() {
        ReservationTransferred reservationTransferred = new ReservationTransferred(
            this
        );
        reservationTransferred.publishAfterCommit();
    }

    public static TransferRepository repository() {
        TransferRepository transferRepository = TransferReservationApplication.applicationContext.getBean(
            TransferRepository.class
        );
        return transferRepository;
    }

    //<<< Clean Arch / Port Method
    public void acceptReservationTransfer(
        AcceptReservationTransferCommand acceptReservationTransferCommand
    ) {
        //implement business logic here:

        ReservationTransferAccepted reservationTransferAccepted = new ReservationTransferAccepted(
            this
        );
        reservationTransferAccepted.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
