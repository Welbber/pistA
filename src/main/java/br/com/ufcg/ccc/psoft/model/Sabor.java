package br.com.ufcg.ccc.psoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sabor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nomeSabor;

	private String tipo; //doce ou salgado

	private Double valorMedio;

	private Double valorGrande;

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

	public void setNomeSabor(String nomeSabor) {
		this.nomeSabor = nomeSabor;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setValorMedio(Double valorMedio) {
		this.valorMedio = valorMedio;
	}

	public void setValorGrande(Double valorGrande) {
		this.valorGrande = valorGrande;
	}
	
	
}