package com.codigoagil.agenda.service;

import java.util.List;

import com.codigoagil.agenda.model.Persona;

/**
 * The Interface PersonaService.
 */
public interface PersonaService {

	/**
	 * Gets the all personas.
	 *
	 * @return the all personas
	 */
	public List<Persona> getAllPersonas();

	/**
	 * Save persona.
	 *
	 * @param persona
	 *        the persona
	 */
	public void savePersona(Persona persona);

	/**
	 * Gets the persona by id.
	 *
	 * @param id
	 *        the id
	 * @return the persona by id
	 */
	public Persona getPersonaById(long id);

	/**
	 * Delete persona by id.
	 *
	 * @param id
	 *        the id
	 */
	public void deletePersonaById(long id);

}
