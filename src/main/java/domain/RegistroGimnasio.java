
package domain;

import java.util.Calendar;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class RegistroGimnasio extends DomainEntity {
	// Constructors -----------------------------------------------------------

	public RegistroGimnasio() {
		super();
	}


	// Attributes -------------------------------------------------------------

	private Calendar fechaAlta;


	@NotBlank
	public Calendar getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(final Calendar fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Calendar getFechaBaja() {
		return this.fechaBaja;
	}

	public void setFechaBaja(final Calendar fechaBaja) {
		this.fechaBaja = fechaBaja;
	}


	private Calendar	fechaBaja;

	// Relationships ----------------------------------------------------------

	private Gimnasio	gimnasio;
	private Cliente		cliente;


	@ManyToOne(optional = false)
	public Gimnasio getGimnasio() {
		return this.gimnasio;
	}

	@ManyToOne(optional = false)
	public Cliente getCliente() {
		return this.cliente;
	}

}
