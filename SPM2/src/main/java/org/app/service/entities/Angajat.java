package org.app.service.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Angajat implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String marcaAngajat;
	private String numeAngajat;
	private String prenumeAngajat;
	private Integer cnpAngajat;
	@Temporal(TemporalType.DATE)
	private Date dataAngajare;
	private String bancaAngajat;
	private String ibanAngajat;
	@OneToMany(mappedBy="angajat", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Contract> contract = new ArrayList<Contract>();
	
	public List<Contract> getContract() {
		return contract;
	}
	public void setContract(List<Contract> contract) {
		this.contract = contract;
	}
	public String getMarcaAngajat() {
		return marcaAngajat;
	}
	public void setMarcaAngajat(String marcaAngajat) {
		this.marcaAngajat = marcaAngajat;
	}
	public String getNumeAngajat() {
		return numeAngajat;
	}
	public void setNumeAngajat(String numeAngajat) {
		this.numeAngajat = numeAngajat;
	}
	public String getPrenumeAngajat() {
		return prenumeAngajat;
	}
	public void setPrenumeAngajat(String prenumeAngajat) {
		this.prenumeAngajat = prenumeAngajat;
	}
	public Integer getCnpAngajat() {
		return cnpAngajat;
	}
	public void setCnpAngajat(Integer cnpAngajat) {
		this.cnpAngajat = cnpAngajat;
	}
	public Date getDataAngajare() {
		return dataAngajare;
	}
	public void setDataAngajare(Date dataAngajare) {
		this.dataAngajare = dataAngajare;
	}
	public String getBancaAngajat() {
		return bancaAngajat;
	}
	public void setBancaAngajat(String bancaAngajat) {
		this.bancaAngajat = bancaAngajat;
	}
	public String getIbanAngajat() {
		return ibanAngajat;
	}
	public void setIbanAngajat(String ibanAngajat) {
		this.ibanAngajat = ibanAngajat;
	}
	public Angajat(String marcaAngajat, String numeAngajat, String prenumeAngajat, Integer cnpAngajat, Date dataAngajare,
			String bancaAngajat, String ibanAngajat) {
		super();
		this.marcaAngajat = marcaAngajat;
		this.numeAngajat = numeAngajat;
		this.prenumeAngajat = prenumeAngajat;
		this.cnpAngajat = cnpAngajat;
		this.dataAngajare = dataAngajare;
		this.bancaAngajat = bancaAngajat;
		this.ibanAngajat = ibanAngajat;
	}
	public Angajat() {
		super();
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
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
	}
	
	
	
}
