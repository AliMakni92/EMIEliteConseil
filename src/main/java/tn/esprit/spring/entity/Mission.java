package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="mission")
public class Mission implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idMission;
	@Column(name="type_mission")
	private String typeMission;
	@Column(name="date_debut")
	private String dateDebut;
	@Column(name="duree")
	private String duree;
	@JsonIgnore 
	@ManyToOne
	@JoinColumn(name="idUser")
	private User usermissions;
	//@ManyToMany
	//private List<Offre> offres;
	@OneToMany(mappedBy="missionaffectation")
	private List<Affectation> affectationsmissions;
	public Long getIdMission() {
		return idMission;
	}
	public void setIdMission(Long idMission) {
		this.idMission = idMission;
	}
	public String getTypeMission() {
		return typeMission;
	}
	public void setTypeMission(String typeMission) {
		this.typeMission = typeMission;
	}
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public User getUsermissions() {
		return usermissions;
	}
	public void setUsermissions(User usermissions) {
		this.usermissions = usermissions;
	}
	public List<Affectation> getAffectationsmissions() {
		return affectationsmissions;
	}
	public void setAffectationsmissions(List<Affectation> affectationsmissions) {
		this.affectationsmissions = affectationsmissions;
	}
	
	//public List<Offre> getOffres() {
		//return offres;
	//}
	//public void setOffres(List<Offre> offres) {
		//this.offres = offres;
	//}
	
}
