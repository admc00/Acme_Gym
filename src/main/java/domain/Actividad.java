
package domain;

import java.util.Calendar;
import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Actividad extends DomainEntity {
	// Constructors -----------------------------------------------------------

	public Actividad() {
		super();
	}


	// Attributes -------------------------------------------------------------

	private String titulo;


	@NotBlank
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(final String titulo) {
		this.titulo = titulo;
	}

	@URL
	public String getFotos() {
		return this.fotos;
	}

	public void setFotos(final String fotos) {
		this.fotos = fotos;
	}

	@NotBlank
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}

	public Calendar getDiaSemana() {
		return this.diaSemana;
	}

	public void setDiaSemana(final Calendar diaSemana) {
		this.diaSemana = diaSemana;
	}

	public Calendar getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(final Calendar horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Calendar getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(final Calendar horaFin) {
		this.horaFin = horaFin;
	}

	public int getNumeroPlazas() {
		return this.numeroPlazas;
	}

	public void setNumeroPlazas(final int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}


	private String							fotos;
	private String							descripcion;
	private Calendar						diaSemana;
	private Calendar						horaInicio;
	private Calendar						horaFin;
	private int								numeroPlazas;

	// Relationships ----------------------------------------------------------

	private Collection<Entrenador>			entrenador;
	private Gimnasio						gimnasio;
	private Collection<RegistroActividad>	registrosActividad;


	@ManyToMany
	public Collection<Entrenador> getEntrenador() {
		return this.entrenador;
	}

	@ManyToOne(optional = false)
	public Gimnasio getGimnasio() {
		return this.gimnasio;
	}

	@OneToMany
	public Collection<RegistroActividad> getregistrosActividad() {
		return this.registrosActividad;
	}

}
