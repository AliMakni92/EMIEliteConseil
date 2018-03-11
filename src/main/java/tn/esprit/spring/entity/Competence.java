package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="competence")
public class Competence  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCompetence;
	@Column(name="poste_actuelle")
	private String posteactuelle;
	@Column(name="domaine_de_travaille")
	private String domainedetravaille;
	@Column(name="info_competence")
	private String infoCompetence;
	@JsonIgnore 
	@ManyToOne
	@JoinColumn(name="idUser",referencedColumnName="idUser",updatable=false,insertable=false)
	private User user;
	@OneToMany(mappedBy="competence")
	private List<Experience> experiences;
	public Long getIdCompetence() {
		return idCompetence;
	}
	public void setIdCompetence(Long idCompetence) {
		this.idCompetence = idCompetence;
	}
	public String getPosteactuelle() {
		return posteactuelle;
	}
	public void setPosteactuelle(String posteactuelle) {
		this.posteactuelle = posteactuelle;
	}
	public String getDomainedetravaille() {
		return domainedetravaille;
	}
	public void setDomainedetravaille(String domainedetravaille) {
		this.domainedetravaille = domainedetravaille;
	}
	public String getInfoCompetence() {
		return infoCompetence;
	}
	public void setInfoCompetence(String infoCompetence) {
		this.infoCompetence = infoCompetence;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Experience> getExperiences() {
		return experiences;
	}
	public void setExperiences(List<Experience> experiences) {
		this.experiences = experiences;
	}


}
