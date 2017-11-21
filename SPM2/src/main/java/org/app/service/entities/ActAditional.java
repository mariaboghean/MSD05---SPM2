package org.app.service.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="ActAditional")
@DiscriminatorValue("ActAditional")
public class ActAditional extends Contract implements Serializable {
	
	private String detaliiActAditional;
	@OneToOne
	private Contract contract;

	
	public String getDetaliiActAditional() {
		return detaliiActAditional;
	}

	public void setDetaliiActAditional(String detaliiActAditional) {
		this.detaliiActAditional = detaliiActAditional;
	}

	public ActAditional() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ActAditional(Integer numarContract, Date dataincheieriiContract, Date dataincetareContract,
			String detaliiContract, Float procentPenalizare, Client client, Angajat angajat, Penalizare penalizare) {
		super(numarContract, dataincheieriiContract, dataincetareContract, detaliiContract, procentPenalizare, client, angajat,
				penalizare);
		// TODO Auto-generated constructor stub
	}
	
}
