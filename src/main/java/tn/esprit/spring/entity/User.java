package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Entity
@Table(name="user")
@EntityListeners(AuditingEntityListener.class)
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idUser;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="login")
	private String login;
	@Column(name="mot_de_passe")
	private String motdepasse;
	@Column(name="email")
	private String email;
	@Column(name="role")
	private String role;
	@Column(name="enabled")
	private boolean enabled;
	@OneToMany(mappedBy="user")
	private List<Competence> competences;
	@OneToMany(mappedBy="useroffre")
	private List<Offre> offres;
	@OneToMany(mappedBy="userparticipation")
	private List<Participation> participations;
	//@ManyToMany(mappedBy="userformations")
	//private List<Formation> formations;
	@OneToMany(mappedBy="usermissions")
	private List<Mission> missions;
	@OneToMany(mappedBy="userreponse")
	private List<Reponse>reponses;
	
	public Long getIdUser() {
		return idUser;
	}

	public void setId(Long idUser) {
		this.idUser = idUser;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Competence> getCompetences() {
		return competences;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotdepasse() {
		return motdepasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
	public void setCompetences(List<Competence> competences) {
		this.competences = competences;
	}

	//public List<Formation> getFormations() {
		//return formations;
	//}

	//public void setFormations(List<Formation> formations) {
		//this.formations = formations;
	//}

	public List<Offre> getOffres() {
		return offres;
	}

	public void setOffres(List<Offre> offres) {
		this.offres = offres;
	}

	public User() {
		super();
	}

	public User(String nom, String prenom, String login, String motdepasse, String email, boolean enabled) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.motdepasse = motdepasse;
		this.email = email;
		this.enabled = enabled;
	}

	public User(String nom, String prenom, String login, String motdepasse, String email, String role,
			boolean enabled) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.motdepasse = motdepasse;
		this.email = email;
		this.role = role;
		this.enabled = enabled;
	}
	
	

	
}
