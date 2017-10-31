package org.app.service.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Penalizare {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idPenalizare;
	private Float procentPenalizare;
	private enum status {achitat, neachitat}
	public Integer getIdPenalizare() {
		return idPenalizare;
	}
	public void setIdPenalizare(Integer idPenalizare) {
		this.idPenalizare = idPenalizare;
	}
	public Float getProcentPenalizare() {
		return procentPenalizare;
	}
	public void setProcentPenalizare(Float procentPenalizare) {
		this.procentPenalizare = procentPenalizare;
	}
	public Penalizare(Integer idPenalizare, Float procentPenalizare) {
		super();
		this.idPenalizare = idPenalizare;
		this.procentPenalizare = procentPenalizare;
	}
	public Penalizare() {
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
	};
	
	
}
