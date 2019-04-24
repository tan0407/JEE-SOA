package jpa;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;


@Entity
public class Rdv {
	
	private long id;
	private Date date;
	private Patient patient;

	

	public Rdv() {
		
	}
	public Rdv(long id,Date date, Patient patient) {
		super();
		this.id = id;
		this.date = date;
		this.patient = patient;
	}
	
	@ManyToOne
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	
}