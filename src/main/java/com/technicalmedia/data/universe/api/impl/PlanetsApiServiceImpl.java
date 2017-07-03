package com.technicalmedia.data.universe.api.impl;

import com.technicalmedia.data.universe.api.*;
import com.technicalmedia.data.universe.api.NotFoundException;
import com.technicalmedia.data.universe.model.Planet;
import com.technicalmedia.data.universe.model.Moon;

import javax.validation.constraints.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.util.ArrayList;
import java.util.List;

public class PlanetsApiServiceImpl extends PlanetsApiService {
    @Override
    public Response listPlanets(
            Integer take,
            Integer skip,
            String sort,
            SecurityContext securityContext)
            throws NotFoundException {
        List<Planet> planets = new ArrayList<Planet>();
        planets.add(new Planet()
                .id(1L)
                .name("mercury")
                .orderFromSun(1)
                .size(1515.5D) // radius in miles
        );
        planets.add(new Planet()
                .id(2L)
                .name("venus")
                .orderFromSun(2)
                .size(3760.5D) // radius in miles
        );
        planets.add(new Planet()
                .id(3L)
                .name("earth")
                .orderFromSun(3)
                .size(3959D) // radius in miles
                .addMoonsItem(new Moon()
                                .id(1L)
                                .name("moon")
                                .orderFromPlanet(1)
                                .size(1079.5D)
                        )
        );
        return Response.ok(
                planets.toArray(
                        new Planet[planets.size()]))
                .build();
    }
}
