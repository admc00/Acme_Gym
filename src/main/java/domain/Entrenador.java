
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
@Access(AccessType.PROPERTY)
public class Entrenador extends Actor {
	// Constructors -----------------------------------------------------------

	public Entrenador() {
		super();
	}

	// Attributes -------------------------------------------------------------


	// Relationships ----------------------------------------------------------

	private Collection<Actividad>	actividad;
	private CV						cv;


	@ManyToMany
	public Collection<Actividad> getActividad() {
		return this.actividad;
	}

	@OneToOne(optional = true)
	public CV getCV() {
		return this.cv;
	}

}
