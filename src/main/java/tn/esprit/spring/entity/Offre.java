package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name="offre")
public class Offre implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idOffre;
	@Column(name="description_offre")
	private String descriptionOffre;
	@Column(name="date_publication")
	private Date datePublication;
	@Column(name="date_expiration")
	private Date dateExpiration;
	@JsonIgnore 
	@ManyToOne
	@JoinColumn(name="idUser",referencedColumnName="idUser",updatable=false,insertable=false)
	private User useroffre;
	//@ManyToMany
	//private List<Besoin> besoinspouroffres;
	@OneToMany(mappedBy="offrematching")
	private List<Matching> matchings;
	//@ManyToMany
	//private List<Mission> missions;
	@OneToMany(mappedBy="offreaffectation")
	private List<Affectation> affectations;

	public Long getIdOffre() {
		return idOffre;
	}
	public void setIdOffre(Long idOffre) {
		this.idOffre = idOffre;
	}
	public String getDescriptionOffre() {
		return descriptionOffre;
	}
	public void setDescriptionOffre(String descriptionOffre) {
		this.descriptionOffre = descriptionOffre;
	}
	public Date getDatePublication() {
		return datePublication;
	}
	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}
	public Date getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	public User getUseroffre() {
		return useroffre;
	}
	public void setUseroffre(User useroffre) {
		this.useroffre = useroffre;
	}

	//public List<Besoin> getBesoinspouroffres() {
		//return besoinspouroffres;
	//}
	//public void setBesoinspouroffres(List<Besoin> besoinspouroffres) {
		//this.besoinspouroffres = besoinspouroffres;
	//}
	public List<Affectation> getAffectations() {
		return affectations;
	}
	public void setAffectations(List<Affectation> affectations) {
		this.affectations = affectations;
	}
	public List<Matching> getMatchings() {
		return matchings;
	}
	public void setMatchings(List<Matching> matchings) {
		this.matchings = matchings;
	}
	
	//public List<Mission> getMissions() {
		//return missions;
	//}
	//public void setMissions(List<Mission> missions) {
		//this.missions = missions;
	//}
	
}
