package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class ReponseId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idUser;
	private Long idQuestion;
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public Long getIdQuestion() {
		return idQuestion;
	}
	public void setIdQuestion(Long idQuestion) {
		this.idQuestion = idQuestion;
	}
	public ReponseId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReponseId(Long idUser, Long idQuestion) {
		super();
		this.idUser = idUser;
		this.idQuestion = idQuestion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idQuestion == null) ? 0 : idQuestion.hashCode());
		result = prime * result + ((idUser == null) ? 0 : idUser.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReponseId other = (ReponseId) obj;
		if (idQuestion == null) {
			if (other.idQuestion != null)
				return false;
		} else if (!idQuestion.equals(other.idQuestion))
			return false;
		if (idUser == null) {
			if (other.idUser != null)
				return false;
		} else if (!idUser.equals(other.idUser))
			return false;
		return true;
	}
	

}
