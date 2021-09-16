package org.acme.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.acme.model.Colaborador;
import org.acme.repository.ColaboradorRepository;

@ApplicationScoped
public class ColaboradorServiceImp implements ColaboradorServiceInterface{

    private final ColaboradorRepository colaboradorRepository;

    @Inject
    ColaboradorServiceImp(ColaboradorRepository colaboradorRepository){
        this.colaboradorRepository = colaboradorRepository;
    }
    
	@Override
	public List<Colaborador> listByName(String nome) {
		String searchInput = "%" + nome + "%";
		return (List<Colaborador>) colaboradorRepository.list("nome like ?1", searchInput); 	
	}

    @Override
    public List<Colaborador> listAll() {
        return colaboradorRepository.listAll();
    }

    @Transactional
    @Override
    public Colaborador saveColaborador(Colaborador colaborador) {
        colaboradorRepository.persist(colaborador);
        return colaborador;
    }

	@Override
	public Colaborador atualizar(Integer id, Colaborador colaborador) {
		String query = String.format("nome = '%s' where idcolaborador = ?1", colaborador.getNome());
		colaboradorRepository.update(query, colaborador.getIdcolaborador().toString());
		return colaborador; 
	}


}
