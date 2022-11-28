package br.com.ufcg.ccc.psoft.model;

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

	private Double valorMedio;

	private Double valorGrande;

	//private Map<String,Double> tamanhosEValores;

	public Sabor(){}

	public Sabor(String nomeSabor, String tipo, double precoTamMedio, double precoTamGrande) {
		this.nomeSabor = nomeSabor;
		this.tipo = tipo;
		this.valorMedio = precoTamMedio;
		this.valorGrande = precoTamGrande;
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

	public Double getValorMedio() {
		return valorMedio;
	}

	public Double getValorGrande() {
		return valorGrande;
	}
}
