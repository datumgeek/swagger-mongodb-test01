package com.technicalmedia.data.universe.api.factories;

import com.technicalmedia.data.universe.api.PlanetsApiService;
import com.technicalmedia.data.universe.api.impl.PlanetsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-06-28T05:23:16.947-06:00")
public class PlanetsApiServiceFactory {
    private final static PlanetsApiService service = new PlanetsApiServiceImpl();

    public static PlanetsApiService getPlanetsApi() {
        return service;
    }
}
