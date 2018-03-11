package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="question")
public class Question implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idQuestion;
	@Column(name="question_psychologie")
	private String questionpsychologie;
	@Column(name="question_professionnnel")
	private String questionprofessionnnel;
	@ManyToOne
	@JoinColumn(name="idMatching",referencedColumnName="idMatching",updatable=false,insertable=false)
	private Matching questionmatching;
	@OneToMany(mappedBy="questionreponse")
	private List<Reponse>reponsesquestions;
	
	public Long getIdQuestion() {
		return idQuestion;
	}
	public void setIdQuestion(Long idQuestion) {
		this.idQuestion = idQuestion;
	}
	//public Matching getMatchingquestion() {
		//return matchingquestion;
	//}
	//public void setMatchingquestion(Matching matchingquestion) {
		//this.matchingquestion = matchingquestion;
	//}
	public String getQuestionpsychologie() {
		return questionpsychologie;
	}
	public void setQuestionpsychologie(String questionpsychologie) {
		this.questionpsychologie = questionpsychologie;
	}
	public String getQuestionprofessionnnel() {
		return questionprofessionnnel;
	}
	public void setQuestionprofessionnnel(String questionprofessionnnel) {
		this.questionprofessionnnel = questionprofessionnnel;
	}
	public Matching getQuestionmatching() {
		return questionmatching;
	}
	public void setQuestionmatching(Matching questionmatching) {
		this.questionmatching = questionmatching;
	}
	public List<Reponse> getReponsesquestions() {
		return reponsesquestions;
	}
	public void setReponsesquestions(List<Reponse> reponsesquestions) {
		this.reponsesquestions = reponsesquestions;
	}
	

}
