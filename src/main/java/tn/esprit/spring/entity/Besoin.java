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
@Table(name="besoin")
public class Besoin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idBesoin;
	@Column(name="type_besoin")
	private String typeBesoin;
	@Column(name="nbre_de_place_besoin")
	private Integer nbredeplaceBesoin;
	@OneToMany(mappedBy="besoinmatching")
	private List<Matching> matchingbesoins;
	//@ManyToMany(mappedBy="besoinspouroffres")
	//private List<Offre> offrespourbesoins;
	public Long getIdBesoin() {
		return idBesoin;
	}
	public void setIdBesoin(Long idBesoin) {
		this.idBesoin = idBesoin;
	}
	public String getTypeBesoin() {
		return typeBesoin;
	}
	public void setTypeBesoin(String typeBesoin) {
		this.typeBesoin = typeBesoin;
	}
	public Integer getNbredeplaceBesoin() {
		return nbredeplaceBesoin;
	}
	public void setNbredeplaceBesoin(Integer nbredeplaceBesoin) {
		this.nbredeplaceBesoin = nbredeplaceBesoin;
	}
	
	public List<Matching> getMatchingbesoins() {
		return matchingbesoins;
	}
	public void setMatchingbesoins(List<Matching> matchingbesoins) {
		this.matchingbesoins = matchingbesoins;
	}
	//public List<Offre> getOffrespourbesoins() {
		//return offrespourbesoins;
	//}
	//public void setOffrespourbesoins(List<Offre> offrespourbesoins) {
		//this.offrespourbesoins = offrespourbesoins;
	//}
	public Besoin() {
		super();
	}
	public Besoin(String typeBesoin, Integer nbredeplaceBesoin) {
		super();
		this.typeBesoin = typeBesoin;
		this.nbredeplaceBesoin = nbredeplaceBesoin;
	}
	
	
}
