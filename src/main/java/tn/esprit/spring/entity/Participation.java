package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="participation")
public class Participation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private ParticipationId participationId;
	@Column(name="frais_de_participation_en_euro")
	private float fraisdeparticipationeneuro; 
	@ManyToOne
	@JoinColumn(name="idFormationparticipation",referencedColumnName="idFormation",updatable=false,insertable=false)
	private Formation formationparticipation;
	@ManyToOne
	@JoinColumn(name="idUserparticipant",referencedColumnName="idUser",updatable=false,insertable=false)
	private User userparticipation;
	public ParticipationId getParticipationId() {
		return participationId;
	}
	public void setParticipationId(ParticipationId participationId) {
		this.participationId = participationId;
	}
	public float getFraisdeparticipationeneuro() {
		return fraisdeparticipationeneuro;
	}
	public void setFraisdeparticipationeneuro(float fraisdeparticipationeneuro) {
		this.fraisdeparticipationeneuro = fraisdeparticipationeneuro;
	}
	public Participation() {
		super();
	}
	public Participation( float fraisdeparticipationeneuro,
			Formation formationparticipation, User userparticipation) {
		super();
		this.participationId = new ParticipationId(userparticipation.getIdUser(), formationparticipation.getIdFormation());
		this.fraisdeparticipationeneuro = fraisdeparticipationeneuro;
		this.formationparticipation = formationparticipation;
		this.userparticipation = userparticipation;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((formationparticipation == null) ? 0 : formationparticipation.hashCode());
		result = prime * result + Float.floatToIntBits(fraisdeparticipationeneuro);
		result = prime * result + ((participationId == null) ? 0 : participationId.hashCode());
		result = prime * result + ((userparticipation == null) ? 0 : userparticipation.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participation other = (Participation) obj;
		if (formationparticipation == null) {
			if (other.formationparticipation != null)
				return false;
		} else if (!formationparticipation.equals(other.formationparticipation))
			return false;
		if (Float.floatToIntBits(fraisdeparticipationeneuro) != Float.floatToIntBits(other.fraisdeparticipationeneuro))
			return false;
		if (participationId == null) {
			if (other.participationId != null)
				return false;
		} else if (!participationId.equals(other.participationId))
			return false;
		if (userparticipation == null) {
			if (other.userparticipation != null)
				return false;
		} else if (!userparticipation.equals(other.userparticipation))
			return false;
		return true;
	}
	

}
