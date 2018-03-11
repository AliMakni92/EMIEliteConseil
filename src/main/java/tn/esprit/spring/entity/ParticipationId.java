package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class ParticipationId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idUserparticipant;
	private Long idFormationparticipation;
	
	public Long getIdUserparticipant() {
		return idUserparticipant;
	}

	public void setIdUserparticipant(Long idUserparticipant) {
		this.idUserparticipant = idUserparticipant;
	}

	public Long getIdFormationparticipation() {
		return idFormationparticipation;
	}

	public void setIdFormationparticipation(Long idFormationparticipation) {
		this.idFormationparticipation = idFormationparticipation;
	}

	public ParticipationId(Long idUserparticipant, Long idFormationparticipation) {
		super();
		this.idUserparticipant = idUserparticipant;
		this.idFormationparticipation = idFormationparticipation;
	}

	public ParticipationId() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idFormationparticipation == null) ? 0 : idFormationparticipation.hashCode());
		result = prime * result + ((idUserparticipant == null) ? 0 : idUserparticipant.hashCode());
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
		ParticipationId other = (ParticipationId) obj;
		if (idFormationparticipation == null) {
			if (other.idFormationparticipation != null)
				return false;
		} else if (!idFormationparticipation.equals(other.idFormationparticipation))
			return false;
		if (idUserparticipant == null) {
			if (other.idUserparticipant != null)
				return false;
		} else if (!idUserparticipant.equals(other.idUserparticipant))
			return false;
		return true;
	}

	
	

}
