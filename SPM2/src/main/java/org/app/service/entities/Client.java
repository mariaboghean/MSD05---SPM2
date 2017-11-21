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
import javax.validation.constraints.NotNull;

@Entity
public class Client implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private Integer idClient;
	private String numeClient;
	private String prenumeClient;
	private Integer cnpClient;	
	@Temporal(TemporalType.DATE)
	private Date dataNasterii;
	private String bancaClient;
	private String ibanClient;
	@OneToMany(mappedBy="client", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Contract> contract = new ArrayList<Contract>();
	
	public List<Contract> getContract() {
		return contract;
	}
	public void setContract(List<Contract> contract) {
		this.contract = contract;
	}
	public Integer getIdClient() {
		return idClient;
	}
	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
	public String getNumeClient() {
		return numeClient;
	}
	public void setNumeClient(String numeClient) {
		this.numeClient = numeClient;
	}
	public String getPrenumeClient() {
		return prenumeClient;
	}
	public void setPrenumeClient(String prenumeClient) {
		this.prenumeClient = prenumeClient;
	}
	public Integer getCnpClient() {
		return cnpClient;
	}
	public void setCnpClient(Integer cnpClient) {
		this.cnpClient = cnpClient;
	}
	public Date getDataNasterii() {
		return dataNasterii;
	}
	public void setDataNasterii(Date dataNasterii) {
		this.dataNasterii = dataNasterii;
	}
	public String getBancaClient() {
		return bancaClient;
	}
	public void setBancaClient(String bancaClient) {
		this.bancaClient = bancaClient;
	}
	public String getIbanClient() {
		return ibanClient;
	}
	public void setIbanClient(String ibanClient) {
		this.ibanClient = ibanClient;
	}
	public Client(Integer idClient, String numeClient, String prenumeClient, Integer cnpClient, Date dataNasterii, String bancaClient,
			String ibanClient) {
		super();
		this.idClient = idClient;
		this.numeClient = numeClient;
		this.prenumeClient = prenumeClient;
		this.cnpClient = cnpClient;
		this.dataNasterii = dataNasterii;
		this.bancaClient = bancaClient;
		this.ibanClient = ibanClient;
	}
	public Client() {
		super();
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
	}
	/*@Override
	public int compareTo(Client o) {
		// TODO Auto-generated method stub
		return 0;
	}*/
	
	
}
