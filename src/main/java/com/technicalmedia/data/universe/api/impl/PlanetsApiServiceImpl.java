package com.technicalmedia.data.universe.api.impl;

import com.technicalmedia.data.universe.api.*;
import com.technicalmedia.data.universe.api.NotFoundException;

import javax.validation.constraints.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-28T05:23:16.947-06:00")
public class PlanetsApiServiceImpl extends PlanetsApiService {
    @Override
    public Response listPlanets(Integer take, Integer skip, String sort, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
