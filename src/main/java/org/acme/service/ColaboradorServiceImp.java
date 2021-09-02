package org.acme.service;

import org.acme.model.Colaborador;
import org.acme.repository.ColaboradorRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class ColaboradorServiceImp implements ColaboradorServiceInterface{

    private final ColaboradorRepository colaboradorRepository;

    @Inject
    ColaboradorServiceImp(ColaboradorRepository colaboradorRepository){
        this.colaboradorRepository = colaboradorRepository;
    }

    @Override
    public List<Colaborador> listAll() {
        return colaboradorRepository.listAll();
    }
}
