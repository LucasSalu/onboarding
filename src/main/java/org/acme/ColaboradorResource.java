package org.acme;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.model.Colaborador;
import org.acme.service.ColaboradorServiceImp;

@Path("/colaboradores")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ColaboradorResource {

    private final ColaboradorServiceImp colaboradorServiceImp;

    @Inject
    ColaboradorResource(ColaboradorServiceImp colaboradorServiceImp){
        this.colaboradorServiceImp = colaboradorServiceImp;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Colaborador> list() {
        return colaboradorServiceImp.listAll();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{nome}")
    public List<Colaborador> listByName(@PathParam("nome") String nome) {
    	if(!nome.isEmpty()) {
    		return colaboradorServiceImp.listByName(nome);
    	}
        return list();
    }

    @POST
    @Transactional
    public Colaborador create(Colaborador colaborador){
    	System.out.println(colaborador);
        return colaboradorServiceImp.saveColaborador(colaborador);
    }
    
    @PUT
    @Path("/{idcolaborador}")
    @Transactional
    public Colaborador update(@PathParam("idcolaborador") Integer id, Colaborador colaborador) { 
    	colaboradorServiceImp.atualizar(id, colaborador);
    	return null; 
    }
    
}