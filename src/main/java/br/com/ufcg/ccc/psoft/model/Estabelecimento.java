package br.com.ufcg.ccc.psoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estabelecimento {

	 	@Id
	 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	private String codigoAcesso;
}
