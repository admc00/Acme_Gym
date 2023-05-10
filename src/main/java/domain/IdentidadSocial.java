
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;

import org.hibernate.validator.constraints.URL;

@Embeddable
@Access(AccessType.PROPERTY)
public class IdentidadSocial {
	
	private String nick;
	private String enlace;
	private String redSocial;
	
	public String getNick() {
		return nick;
	}
	
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	@URL
	public String getEnlace() {
		return enlace;
	}
	
	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}
	
	public String getRedSocial() {
		return redSocial;
	}
	
	public void setRedSocial(String redSocial) {
		this.redSocial = redSocial;
	}
	
}
