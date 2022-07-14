package com.codigoagil.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codigoagil.agenda.model.Persona;

/**
 * The Interface PersonaRepository.
 */
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
