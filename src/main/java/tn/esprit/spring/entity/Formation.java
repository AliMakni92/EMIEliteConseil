package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="formation")
public class Formation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idFormation;
	@Column(name="type_formation")
	private String typeFormation;
	@OneToMany(mappedBy="formationparticipation")
	private List<Participation> participations;
	//@ManyToMany
	//private List<User> userformations;
	public Long getIdFormation() {
		return idFormation;
	}
	public void setIdFormation(Long idFormation) {
		this.idFormation = idFormation;
	}
	public String getTypeFormation() {
		return typeFormation;
	}
	public void setTypeFormation(String typeFormation) {
		this.typeFormation = typeFormation;
	}
	//public List<User> getUserformations() {
		//return userformations;
	//}
	//public void setUserformations(List<User> userformations) {
		//this.userformations = userformations;
	//}

	
}
