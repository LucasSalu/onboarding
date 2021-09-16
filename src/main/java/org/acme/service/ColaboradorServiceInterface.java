package org.acme.service;

import java.util.List;

import org.acme.model.Colaborador;

public interface ColaboradorServiceInterface {
    /* */
    List<Colaborador> listAll();

    /* */
    Colaborador saveColaborador(Colaborador colaborador);
    
    Colaborador atualizar(Integer id, Colaborador colaborador);
    
    List<Colaborador> listByName(String nome);
    
}
