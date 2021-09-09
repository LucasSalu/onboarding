package org.acme.service;

import org.acme.model.Colaborador;
import org.acme.repository.ColaboradorRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
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

    @Transactional
    @Override
    public Colaborador saveColaborador(Colaborador colaborador) {
        colaboradorRepository.persistAndFlush(colaborador);
        return colaborador;
    }
}
