package com.codigoagil.agenda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codigoagil.agenda.model.Persona;
import com.codigoagil.agenda.repository.PersonaRepository;

/**
 * The Class PersonaServiceImpl.
 */
@Service
public class PersonaServiceImpl implements PersonaService {

	/** The persona repository. */
	@Autowired
	private PersonaRepository personaRepository;

	/**
	 * Gets the all personas.
	 *
	 * @return the all personas
	 */
	@Override
	public List<Persona> getAllPersonas() {
		return this.personaRepository.findAll();
	}

	/**
	 * Save persona.
	 *
	 * @param persona
	 *        the persona
	 */
	@Override
	public void savePersona(final Persona persona) {
		this.personaRepository.save(persona);
	}

	/**
	 * Gets the persona by id.
	 *
	 * @param id
	 *        the id
	 * @return the persona by id
	 */
	@Override
	public Persona getPersonaById(final long id) {
		final Optional<Persona> optional = this.personaRepository.findById(id);
		Persona persona = null;

		if (optional.isPresent()) {
			persona = optional.get();
		} else {
			throw new RuntimeException(" Persona no encontrado por id :: " + id);
		}

		return persona;
	}

	/**
	 * Delete persona by id.
	 *
	 * @param id
	 *        the id
	 */
	@Override
	public void deletePersonaById(final long id) {
		this.personaRepository.deleteById(id);

	}

}
