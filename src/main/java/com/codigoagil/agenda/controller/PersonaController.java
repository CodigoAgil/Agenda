package com.codigoagil.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codigoagil.agenda.model.Persona;
import com.codigoagil.agenda.service.PersonaService;

/**
 * The Class PersonaController.
 */
@Controller
public class PersonaController {

	/** The Constant REDIRIGIR_PANTALLA_AGENDA. */
	private static final String REDIRIGIR_PANTALLA_AGENDA = "redirect:/agenda";

	/** The Constant PANTALLA_AGENDA. */
	private static final String PANTALLA_AGENDA = "agenda";

	/** The Constant PANTALLA_NUEVA_ENTRADA_AGENDA. */
	private static final String PANTALLA_NUEVA_ENTRADA_AGENDA = "nueva_entrada_agenda";

	/** The Constant PANTALLA_ACTUALIZAR_ENTRADA_AGENDA. */
	private static final String PANTALLA_ACTUALIZAR_ENTRADA_AGENDA = "update_entrada_agenda";

	/** The persona service. */
	@Autowired
	private PersonaService personaService;

	/**
	 * View agenda page.
	 *
	 * @param model
	 *        the model
	 * @return the string
	 */
	@GetMapping("/agenda")
	public String viewAgendaPage(final Model model) {
		model.addAttribute("listaPersonas", this.personaService.getAllPersonas());
		return PersonaController.PANTALLA_AGENDA;
	}

	/**
	 * Show new tag form.
	 *
	 * @param model
	 *        the model
	 * @return the string
	 */
	@GetMapping("/showNewPersonaForm")
	public String showNewTagForm(final Model model) {
		final Persona persona = new Persona();
		model.addAttribute("persona", persona);
		return PersonaController.PANTALLA_NUEVA_ENTRADA_AGENDA;
	}

	/**
	 * Save tag.
	 *
	 * @param persona
	 *        the persona
	 * @param model
	 *        the model
	 * @return the string
	 */
	@PostMapping("/savePersona")
	public String saveTag(final Persona persona, final Model model) {
		this.personaService.savePersona(persona);
		return PersonaController.REDIRIGIR_PANTALLA_AGENDA;
	}

	/**
	 * Update tag.
	 *
	 * @param persona
	 *        the persona
	 * @param model
	 *        the model
	 * @return the string
	 */
	@PostMapping("/updatePersona")
	public String updateTag(final Persona persona, final Model model) {
		this.personaService.savePersona(persona);
		return PersonaController.REDIRIGIR_PANTALLA_AGENDA;
	}

	/**
	 * Show form for update persona.
	 *
	 * @param id
	 *        the id
	 * @param model
	 *        the model
	 * @return the string
	 */
	@GetMapping("/showFormForUpdatePersona/{id}")
	public String showFormForUpdatePersona(@PathVariable(value = "id") final long id, final Model model) {
		final Persona persona = this.personaService.getPersonaById(id);
		model.addAttribute("persona", persona);
		return PersonaController.PANTALLA_ACTUALIZAR_ENTRADA_AGENDA;
	}

	/**
	 * Delete persona.
	 *
	 * @param id
	 *        the id
	 * @return the string
	 */
	@GetMapping("/deletePersona/{id}")
	public String deletePersona(@PathVariable(value = "id") final long id) {
		this.personaService.deletePersonaById(id);
		return PersonaController.REDIRIGIR_PANTALLA_AGENDA;
	}
}
