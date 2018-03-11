package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="affectation")
public class Affectation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private AffectationId affectationId;
	@Column(name="frais_affectation_en_euro")
	private float fraisaffectationeneuro;
	@ManyToOne
	@JoinColumn(name="idOffreAffectation",referencedColumnName="idOffre",updatable=false,insertable=false)
	private Offre offreaffectation;
	@ManyToOne
	@JoinColumn(name="idMissionAffectation",referencedColumnName="idMission",updatable=false,insertable=false)
	private Mission missionaffectation;
	public AffectationId getAffectationId() {
		return affectationId;
	}
	public void setAffectationId(AffectationId affectationId) {
		this.affectationId = affectationId;
	}
	public Affectation() {
		super();
	}
	public Affectation(float fraisaffectationeneuro, Offre offreaffectation, Mission missionaffectation) {
		super();
		this.fraisaffectationeneuro = fraisaffectationeneuro;
		this.affectationId=new AffectationId(offreaffectation.getIdOffre(), missionaffectation.getIdMission());
		this.offreaffectation = offreaffectation;
		this.missionaffectation = missionaffectation;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((affectationId == null) ? 0 : affectationId.hashCode());
		result = prime * result + Float.floatToIntBits(fraisaffectationeneuro);
		result = prime * result + ((missionaffectation == null) ? 0 : missionaffectation.hashCode());
		result = prime * result + ((offreaffectation == null) ? 0 : offreaffectation.hashCode());
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
		Affectation other = (Affectation) obj;
		if (affectationId == null) {
			if (other.affectationId != null)
				return false;
		} else if (!affectationId.equals(other.affectationId))
			return false;
		if (Float.floatToIntBits(fraisaffectationeneuro) != Float.floatToIntBits(other.fraisaffectationeneuro))
			return false;
		if (missionaffectation == null) {
			if (other.missionaffectation != null)
				return false;
		} else if (!missionaffectation.equals(other.missionaffectation))
			return false;
		if (offreaffectation == null) {
			if (other.offreaffectation != null)
				return false;
		} else if (!offreaffectation.equals(other.offreaffectation))
			return false;
		return true;
	}
	

}
