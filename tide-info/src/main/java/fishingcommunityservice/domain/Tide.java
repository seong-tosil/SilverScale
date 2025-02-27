package fishingcommunityservice.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import fishingcommunityservice.TideInfoApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Tide_table")
@Data
//<<< DDD / Aggregate Root
public class Tide {

    @Id
    private String tideId;

    private String location;

    public static TideRepository repository() {
        TideRepository tideRepository = TideInfoApplication.applicationContext.getBean(
            TideRepository.class
        );
        return tideRepository;
    }
}
//>>> DDD / Aggregate Root
