package fishingcommunityservice.infra;

import fishingcommunityservice.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class TideHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Tide>> {

    @Override
    public EntityModel<Tide> process(EntityModel<Tide> model) {
        return model;
    }
}
