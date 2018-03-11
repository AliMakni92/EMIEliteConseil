package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class AffectationId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idOffreAffectation;
	private Long idMissionAffectation;
	public Long getIdOffreAffectation() {
		return idOffreAffectation;
	}
	public void setIdOffreAffectation(Long idOffreAffectation) {
		this.idOffreAffectation = idOffreAffectation;
	}
	public Long getIdMissionAffectation() {
		return idMissionAffectation;
	}
	public void setIdMissionAffectation(Long idMissionAffectation) {
		this.idMissionAffectation = idMissionAffectation;
	}
	public AffectationId() {
		super();
	}
	public AffectationId(Long idOffreAffectation, Long idMissionAffectation) {
		super();
		this.idOffreAffectation = idOffreAffectation;
		this.idMissionAffectation = idMissionAffectation;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMissionAffectation == null) ? 0 : idMissionAffectation.hashCode());
		result = prime * result + ((idOffreAffectation == null) ? 0 : idOffreAffectation.hashCode());
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
		AffectationId other = (AffectationId) obj;
		if (idMissionAffectation == null) {
			if (other.idMissionAffectation != null)
				return false;
		} else if (!idMissionAffectation.equals(other.idMissionAffectation))
			return false;
		if (idOffreAffectation == null) {
			if (other.idOffreAffectation != null)
				return false;
		} else if (!idOffreAffectation.equals(other.idOffreAffectation))
			return false;
		return true;
	}
	

}
