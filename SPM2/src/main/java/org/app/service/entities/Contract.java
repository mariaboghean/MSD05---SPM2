package org.app.service.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.DiscriminatorType;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Contract")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name ="Type", discriminatorType= DiscriminatorType.STRING)
@DiscriminatorValue("Contract")
public class Contract implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer numarContract;
	
	@Temporal(TemporalType.DATE)
	private Date dataincheieriiContract;
	@Temporal(TemporalType.DATE)
	private Date dataincetareContract;
	private String detaliiContract;
	public enum tipContract {
		client, angajat};
	private tipContract tipContr;
	
	@ManyToOne
	private Client client;
	@ManyToOne
	private Angajat angajat;
	
	@OneToOne // (cascade= {CascadeType.PERSIST,CascadeType.REMOVE, CascadeType.REFRESH})
	// @JoinColumn(name = "penalizare")
	private Penalizare penalizare;

	
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Angajat getAngajat() {
		return angajat;
	}

	public void setAngajat(Angajat angajat) {
		this.angajat = angajat;
	}

	public Integer getNumarContract() {
		return numarContract;
	}

	public void setNumarContract(Integer numarContract) {
		this.numarContract = numarContract;
	}

	public Date getDataincheieriiContract() {
		return dataincheieriiContract;
	}

	public void setDataincheieriiContract(Date dataincheieriiContract) {
		this.dataincheieriiContract = dataincheieriiContract;
	}

	public Date getDataincetareContract() {
		return dataincetareContract;
	}

	public void setDataincetareContract(Date dataincetareContract) {
		this.dataincetareContract = dataincetareContract;
	}

	public String getDetaliiContract() {
		return detaliiContract;
	}

	public void setDetaliiContract(String detaliiContract) {
		this.detaliiContract = detaliiContract;
	}

	public Penalizare getPenalizare() {
		return penalizare;
	}

	public void setPenalizare(Penalizare penalizare) {
		this.penalizare = penalizare;
	}

	public Contract() {
		super();
	}

	public Contract(Integer numarContract, Date dataincheieriiContract, Date dataincetareContract,
			String detaliiContract, Float procentPenalizare, Client client, Angajat angajat, Penalizare penalizare) {
		super();
		this.numarContract = numarContract;
		this.dataincheieriiContract = dataincheieriiContract;
		this.dataincetareContract = dataincetareContract;
		this.detaliiContract = detaliiContract;
		this.client = client;
		this.angajat = angajat;
		this.penalizare = penalizare;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	};

}
