package fishingcommunityservice.infra;

import fishingcommunityservice.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class BookingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Booking>> {

    @Override
    public EntityModel<Booking> process(EntityModel<Booking> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/undefined")
                .withRel("")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/undefined")
                .withRel("")
        );

        return model;
    }
}
