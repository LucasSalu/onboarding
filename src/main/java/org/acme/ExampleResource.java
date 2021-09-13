package org.acme;

import org.acme.model.Colaborador;
import org.acme.service.ColaboradorServiceImp;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/colaboradores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExampleResource {

    private final ColaboradorServiceImp colaboradorServiceImp;

    @Inject
    ExampleResource(ColaboradorServiceImp colaboradorServiceImp){
        this.colaboradorServiceImp = colaboradorServiceImp;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Colaborador> list() {
        return colaboradorServiceImp.listAll();
    }

    @POST
    @Transactional
    public Colaborador create(Colaborador colaborador){
        return colaboradorServiceImp.saveColaborador(colaborador);
    }
}