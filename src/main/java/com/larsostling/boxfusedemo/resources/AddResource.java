package com.larsostling.boxfusedemo.resources;

import com.codahale.metrics.annotation.Timed;
import com.larsostling.boxfusedemo.core.CalculationResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path(value = "/add")
@Produces(value = MediaType.APPLICATION_JSON)
public class AddResource {
    @GET
    @Timed
    public CalculationResponse add(@QueryParam("n1") int numberOne,
                                   @QueryParam("n2") int numberTwo) {
        return new CalculationResponse(numberOne + numberTwo);
    }
}
