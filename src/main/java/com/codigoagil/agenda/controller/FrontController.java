package com.codigoagil.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The Class FrontController.
 */
@Controller
public class FrontController {

	/** The Constant PAGINA_INDICE. */
	private static final String PAGINA_INDICE = "index";

	/**
	 * View index page.
	 *
	 * @param model
	 *        the model
	 * @return the string
	 */
	@GetMapping({ "/", "/index" })
	public String viewIndexPage(final Model model) {
		return FrontController.PAGINA_INDICE;

	}
}
