package com.technicalmedia.data.universe.api;

import com.technicalmedia.data.universe.api.factories.PlanetsApiServiceFactory;
import com.technicalmedia.data.universe.model.Planet;
import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import javax.validation.constraints.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@Path("/planets")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the planets API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-28T05:23:16.947-06:00")
public class PlanetsApi  {
   private final PlanetsApiService delegate = PlanetsApiServiceFactory.getPlanetsApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get all planets", notes = "", response = Planet.class, responseContainer = "List", tags={ "planet", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A paged array of planets", response = Planet.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Planet.class, responseContainer = "List") })
    public Response listPlanets(@ApiParam(value = "number of planets to return") @QueryParam("take") Integer take
, @ApiParam(value = "number of planets to skip") @QueryParam("skip") Integer skip
, @ApiParam(value = "sort string in ag-grid stringified sort criteria") @QueryParam("sort") String sort
, @Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.listPlanets(take,skip,sort,securityContext);
    }
}
