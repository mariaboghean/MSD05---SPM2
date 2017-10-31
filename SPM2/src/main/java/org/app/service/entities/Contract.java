package org.app.service.entities;

import java.util.Date;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Contract {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer numarContract;
	@Temporal(TemporalType.DATE)
	private Date dataincheieriiContract;
	@Temporal(TemporalType.DATE)
	private Date dataincetareContract;
	private String detaliiContract;
	private Float procentPenalizare;
	private enum tipContract {client, angajat};
	@ManyToOne
	private Client client;
	@ManyToOne
	private Angajat angajat;
	@OneToOne//(cascade= {CascadeType.PERSIST,CascadeType.REMOVE, CascadeType.REFRESH})
	//@JoinColumn(name = "penalizare")
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
	public Float getProcentPenalizare() {
		return procentPenalizare;
	}
	public void setProcentPenalizare(Float procentPenalizare) {
		this.procentPenalizare = procentPenalizare;
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
		this.procentPenalizare = procentPenalizare;
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
