package jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {

	private long id;
	private String name;
	private String phoneNumber;
	private List<Rdv> rdv;

	public Patient() {
	}

	public Patient(long id, String phoneNumber, String name, List<Rdv> rdv) {
		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.rdv = rdv;
	}

	public Patient(long id, String phoneNumber, String name) {
		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.rdv = new ArrayList<Rdv>();
	}

	public List<Rdv> getRdvs() {
		return this.rdv;
	}

	public void setRdvs(List<Rdv> rdv) {
		this.rdv = rdv;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override

	public String toString() {

		return "Patient [Patients=" + ", id=" + id + ", name=" + name + ", PhoneNumber" + phoneNumber + "]";

	}

}

/*
 * public Patient(String name, Rdv Rdv) { super(); this.name = name;
 * this.Rdvs.add(Rdv); }
 * 
 * @Id
 * 
 * @GeneratedValue(strategy=GenerationType.AUTO) public long getId() { return
 * id; } public void setId(long id) { this.id = id; } public String getName() {
 * return name; } public void setName(String name) { this.name = name; }
 * 
 * @OneToMany(fetch = FetchType.EAGER, mappedBy="patient")
 * 
 * @JsonIgnore public List<Rdv> getRents() { return Rdv; }
 * 
 * public void setRents(List<Rdv> Rdvs) { this.Rdvs = Rdvs; }
 * 
 * @Override public String toString() { return "Patient{" + "id=" + id +
 * ", name='" + name + '\'' + ", Rdvs=" +Rdvs + '}'; }
 * 
 * public void addRent(Rdv Rdv) { this.Rdvs.add(Rdv); } }
 */
