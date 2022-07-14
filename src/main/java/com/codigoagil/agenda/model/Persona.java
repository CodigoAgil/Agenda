package com.codigoagil.agenda.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Persona.
 */
@Entity
@Table(name = "persona")
public class Persona {

	/** The id persona. */
	@Id
	@Column(name = "idPersona", nullable = false)
	private Long idPersona;

	/** The nombre. */
	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;

	/** The apellido 1. */
	@Column(name = "apellido1", length = 50, nullable = false)
	private String apellido1;

	/** The apellido 2. */
	@Column(name = "apellido2", length = 50, nullable = false)
	private String apellido2;

	/** The direccion. */
	@Column(name = "direccion", length = 100, nullable = false)
	private String direccion;

	/** The telefono 1. */
	@Column(name = "telefono1", length = 15, nullable = false)
	private String telefono1;

	/** The telefono 2. */
	@Column(name = "telefono2", length = 15)
	private String telefono2;

	/** The email. */
	@Column(name = "email", length = 50)
	private String email;

	/**
	 * Instantiates a new persona.
	 */
	public Persona() {
		super();
	}

	/**
	 * Instantiates a new persona.
	 *
	 * @param idPersona
	 *        the id persona
	 * @param nombre
	 *        the nombre
	 * @param apellido1
	 *        the apellido 1
	 * @param apellido2
	 *        the apellido 2
	 * @param direccion
	 *        the direccion
	 * @param telefono1
	 *        the telefono 1
	 * @param telefono2
	 *        the telefono 2
	 * @param email
	 *        the email
	 */
	public Persona(final Long idPersona, final String nombre, final String apellido1, final String apellido2, final String direccion, final String telefono1, final String telefono2,
			final String email) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.telefono1 = telefono1;
		this.telefono2 = telefono2;
		this.email = email;
	}

	/**
	 * Gets the id persona.
	 *
	 * @return the id persona
	 */
	public Long getIdPersona() {
		return this.idPersona;
	}

	/**
	 * Sets the id persona.
	 *
	 * @param idPersona
	 *        the new id persona
	 */
	public void setIdPersona(final Long idPersona) {
		this.idPersona = idPersona;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre
	 *        the new nombre
	 */
	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the apellido 1.
	 *
	 * @return the apellido 1
	 */
	public String getApellido1() {
		return this.apellido1;
	}

	/**
	 * Sets the apellido 1.
	 *
	 * @param apellido1
	 *        the new apellido 1
	 */
	public void setApellido1(final String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * Gets the apellido 2.
	 *
	 * @return the apellido 2
	 */
	public String getApellido2() {
		return this.apellido2;
	}

	/**
	 * Sets the apellido 2.
	 *
	 * @param apellido2
	 *        the new apellido 2
	 */
	public void setApellido2(final String apellido2) {
		this.apellido2 = apellido2;
	}

	/**
	 * Gets the direccion.
	 *
	 * @return the direccion
	 */
	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * Sets the direccion.
	 *
	 * @param direccion
	 *        the new direccion
	 */
	public void setDireccion(final String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Gets the telefono 1.
	 *
	 * @return the telefono 1
	 */
	public String getTelefono1() {
		return this.telefono1;
	}

	/**
	 * Sets the telefono 1.
	 *
	 * @param telefono1
	 *        the new telefono 1
	 */
	public void setTelefono1(final String telefono1) {
		this.telefono1 = telefono1;
	}

	/**
	 * Gets the telefono 2.
	 *
	 * @return the telefono 2
	 */
	public String getTelefono2() {
		return this.telefono2;
	}

	/**
	 * Sets the telefono 2.
	 *
	 * @param telefono2
	 *        the new telefono 2
	 */
	public void setTelefono2(final String telefono2) {
		this.telefono2 = telefono2;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email
	 *        the new email
	 */
	public void setEmail(final String email) {
		this.email = email;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Persona [idPersona=" + this.idPersona + ", nombre=" + this.nombre + ", apellido1=" + this.apellido1 + ", apellido2=" + this.apellido2 + ", direccion=" + this.direccion
				+ ", telefono1=" + this.telefono1 + ", telefono2=" + this.telefono2 + ", email=" + this.email + "]";
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.apellido1, this.apellido2, this.direccion, this.email, this.idPersona, this.nombre, this.telefono1, this.telefono2);
	}

	/**
	 * Equals.
	 *
	 * @param obj
	 *        the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null) || (getClass() != obj.getClass())) {
			return false;
		}
		final Persona other = (Persona) obj;
		return Objects.equals(this.apellido1, other.apellido1) && Objects.equals(this.apellido2, other.apellido2) && Objects.equals(this.direccion, other.direccion)
				&& Objects.equals(this.email, other.email) && Objects.equals(this.idPersona, other.idPersona) && Objects.equals(this.nombre, other.nombre)
				&& Objects.equals(this.telefono1, other.telefono1) && Objects.equals(this.telefono2, other.telefono2);
	}

}
