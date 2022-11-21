package br.com.ufcg.ccc.psoft.model;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Sabor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nomeSabor;

	private String tipo; //doce ou salgado
	
	@Autowired
	private Map<String,Double> tamanhosEValores;

	public Sabor(String nomeSabor, String tipo, double precoTamMedio, double precoTamGrande) {
		this.nomeSabor = nomeSabor;
		this.tipo = tipo;
		this.tamanhosEValores.put("medio", precoTamMedio);
		this.tamanhosEValores.put("medio", precoTamGrande);
	}

	public Long getId() {
		return id;
	}

	public String getNomeSabor() {
		return nomeSabor;
	}

	public String getTipo() {
		return tipo;
	}

	public Map<String, Double> getTamanhosEValores() {
		return tamanhosEValores;
	}
	
	
	
	
}
