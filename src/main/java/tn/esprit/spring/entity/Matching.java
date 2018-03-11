package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="matching")
public class Matching implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idMatching;
	@Column(name="type_de_matching")
	private String typedematching;

	
	@ManyToOne
	@JoinColumn(name="idOffreMatching",referencedColumnName="idOffre",updatable=false,insertable=false)
	private Offre offrematching;
	@ManyToOne
	@JoinColumn(name="idBesoinMatching",referencedColumnName="idBesoin",updatable=false,insertable=false)
	private Besoin besoinmatching;
	//@OneToMany(mappedBy="matchingquestion",fetch=FetchType.EAGER)
	//private List<Question> questionautomatiques;
	@OneToMany(mappedBy="questionmatching")
	private List<Question> questionsmatching;
	public String getTypedematching() {
		return typedematching;
	}
	public Long getIdMatching() {
		return idMatching;
	}
	public void setIdMatching(Long idMatching) {
		this.idMatching = idMatching;
	}
	public void setTypedematching(String typedematching) {
		this.typedematching = typedematching;
	}

	
	public Offre getOffrematching() {
		return offrematching;
	}
	public void setOffrematching(Offre offrematching) {
		this.offrematching = offrematching;
	}
	public Besoin getBesoinmatching() {
		return besoinmatching;
	}
	public void setBesoinmatching(Besoin besoinmatching) {
		this.besoinmatching = besoinmatching;
	}
	public Matching() {
		super();
	}
	public Matching(String typedematching,Offre offrematching, Besoin besoinmatching) {
		super();
		this.typedematching = typedematching;
		this.offrematching = offrematching;
		this.besoinmatching = besoinmatching;
	}
	//public List<Question> getQuestionautomatiques() {
		//return questionautomatiques;
	//}
	//public void setQuestionautomatiques(List<Question> questionautomatiques) {
		//this.questionautomatiques = questionautomatiques;
	//}
	public List<Question> getQuestionsmatching() {
		return questionsmatching;
	}
	public void setQuestionsmatching(List<Question> questionsmatching) {
		this.questionsmatching = questionsmatching;
	}
	
	
}
