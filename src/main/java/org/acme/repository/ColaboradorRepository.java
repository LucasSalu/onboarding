package org.acme.repository;

import javax.enterprise.context.ApplicationScoped;

import org.acme.model.Colaborador;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class ColaboradorRepository implements PanacheRepository<Colaborador> {
}
