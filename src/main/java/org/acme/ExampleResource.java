package org.acme;

import org.acme.service.ColaboradorServiceImp;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    private final ColaboradorServiceImp colaboradorServiceImp;

    @Inject
    ExampleResource(ColaboradorServiceImp colaboradorServiceImp){
        this.colaboradorServiceImp = colaboradorServiceImp;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return colaboradorServiceImp.listAll().toString();
    }
}