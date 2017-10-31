package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class ActAditional extends Contract {
	private String detaliiActAditional;

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
