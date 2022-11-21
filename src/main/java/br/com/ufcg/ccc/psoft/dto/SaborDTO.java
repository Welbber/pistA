package br.com.ufcg.ccc.psoft.dto;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class SaborDTO {

	private Long id;

	private String nomeSabor;

	private String tipo; 
	
	@Autowired
	private Map<String,Double> tamanhosEValores;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeSabor() {
		return nomeSabor;
	}

	public void setNomeSabor(String nomeSabor) {
		this.nomeSabor = nomeSabor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Map<String, Double> getTamanhosEValores() {
		return tamanhosEValores;
	}

	public void setTamanhosEValores(Map<String, Double> tamanhosEValores) {
		this.tamanhosEValores = tamanhosEValores;
	}
	
	
}
