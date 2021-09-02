package org.acme.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.model.Colaborador;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ColaboradorRepository implements PanacheRepository<Colaborador> {
}
