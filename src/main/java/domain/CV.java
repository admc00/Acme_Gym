
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class CV extends DomainEntity {
	// Constructors -----------------------------------------------------------

	public CV() {
		super();
	}


	// Attributes -------------------------------------------------------------

	private String				nombre;
	private String				apellido;
	private String				especialidad;
	private String				formacion;
	private int					experienciaLaboral;
	private IdentidadSocial[]	identidadSocial;


	@NotBlank
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	@NotBlank
	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(final String apellido) {
		this.apellido = apellido;
	}

	public String getEspecialidad() {
		return this.especialidad;
	}

	public void setEspecialidad(final String especialidad) {
		this.especialidad = especialidad;
	}

	@NotBlank
	public String getFormacion() {
		return this.formacion;
	}

	public void setFormacion(final String formacion) {
		this.formacion = formacion;
	}

	public int getExperienciaLaboral() {
		return this.experienciaLaboral;
	}

	public void setExperienciaLaboral(final int experienciaLaboral) {
		this.experienciaLaboral = experienciaLaboral;
	}

	public IdentidadSocial[] getIdentidadSocial() {
		return this.identidadSocial;
	}

	public void setIdentidadSocial(final IdentidadSocial[] identidadSocial) {
		this.identidadSocial = identidadSocial;
	}

	// Relationships ----------------------------------------------------------

}
