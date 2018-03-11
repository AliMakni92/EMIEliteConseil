package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="experience")
public class Experience implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idExperience;
	@Column(name="itulite_poste")
	private String itulitePoste;
	@Column(name="nom_entreprise")
	private String nomEntreprise;
	@Column(name="lieu")
	private String lieu;
	@Column(name="date_debut")
	private Date dateDebut;
	@Column(name="date_fin")
	private Date dateFin;
	@JsonIgnore 
	@ManyToOne
	@JoinColumn(name="idCompetence")
	private Competence competence;
	public Long getIdExperience() {
		return idExperience;
	}
	public void setIdExperience(Long idExperience) {
		this.idExperience = idExperience;
	}
	public String getItulitePoste() {
		return itulitePoste;
	}
	public void setItulitePoste(String itulitePoste) {
		this.itulitePoste = itulitePoste;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Competence getCompetence() {
		return competence;
	}
	public void setCompetence(Competence competence) {
		this.competence = competence;
	}

	
}
