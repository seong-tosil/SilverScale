package fishingcommunityservice.infra;

import fishingcommunityservice.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class WeatherHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Weather>> {

    @Override
    public EntityModel<Weather> process(EntityModel<Weather> model) {
        return model;
    }
}
