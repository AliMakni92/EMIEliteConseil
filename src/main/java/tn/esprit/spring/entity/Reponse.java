package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="reponse")
public class Reponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private ReponseId reponseId;
	@ManyToOne
	@JoinColumn(name="idUser",referencedColumnName="idUser",updatable=false,insertable=false)
	private User userreponse;
	@ManyToOne
	@JoinColumn(name="idQuestion",referencedColumnName="idQuestion",updatable=false,insertable=false)
	private Question questionreponse;
	@Column(name="type_de_reponse")
	private String typedeReponse;
	
	public ReponseId getReponseId() {
		return reponseId;
	}
	public void setReponseId(ReponseId reponseId) {
		this.reponseId = reponseId;
	}
	public User getUserreponse() {
		return userreponse;
	}
	public void setUserreponse(User userreponse) {
		this.userreponse = userreponse;
	}
	public Question getQuestionreponse() {
		return questionreponse;
	}
	public void setQuestionreponse(Question questionreponse) {
		this.questionreponse = questionreponse;
	}
	public String getTypedeReponse() {
		return typedeReponse;
	}
	public void setTypedeReponse(String typedeReponse) {
		this.typedeReponse = typedeReponse;
	}
	public Reponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Reponse(User userreponse, Question questionreponse, String typedeReponse) {
		super();
		this.reponseId=new ReponseId(userreponse.getIdUser(), questionreponse.getIdQuestion());
		this.userreponse = userreponse;
		this.questionreponse = questionreponse;
		this.typedeReponse = typedeReponse;
	}
	

}
