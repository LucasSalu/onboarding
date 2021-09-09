package org.acme;

import org.acme.model.Colaborador;
import org.acme.service.ColaboradorServiceImp;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
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

    @POST
    @Transactional
    public Colaborador create(Colaborador colaborador){
        return colaboradorServiceImp.saveColaborador(colaborador);
    }

//    public void GenerateNewColaborador(){
//        Colaborador colaborador = new Colaborador();
//        colaborador.setNome("Lucas");
//        colaborador.setIdcolaborador(2);
//        colaborador.setMatricula("2");
//    }
}