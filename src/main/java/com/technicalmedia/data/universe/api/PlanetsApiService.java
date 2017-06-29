package com.technicalmedia.data.universe.api;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-28T05:23:16.947-06:00")
public abstract class PlanetsApiService {
    public abstract Response listPlanets(Integer take, Integer skip, String sort, SecurityContext securityContext) throws NotFoundException;
}
