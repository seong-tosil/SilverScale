package fishingcommunityservice.infra;

import fishingcommunityservice.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class TransferHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Transfer>> {

    @Override
    public EntityModel<Transfer> process(EntityModel<Transfer> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/undefined")
                .withRel("")
        );

        return model;
    }
}
