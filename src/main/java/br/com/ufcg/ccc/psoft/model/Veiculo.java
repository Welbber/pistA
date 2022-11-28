package br.com.ufcg.ccc.psoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String placaVeiculo;

	private String corVeiculo;

	private String Detalhes;

	public Veiculo(String placaVeiculo, String corVeiculo, String detalhes) {
		this.placaVeiculo = placaVeiculo;
		this.corVeiculo = corVeiculo;
		Detalhes = detalhes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlacaVeiculo() {
		return placaVeiculo;
	}

	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}

	public String getCorVeiculo() {
		return corVeiculo;
	}

	public void setCorVeiculo(String corVeiculo) {
		this.corVeiculo = corVeiculo;
	}

	public String getDetalhes() {
		return Detalhes;
	}

	public void setDetalhes(String detalhes) {
		Detalhes = detalhes;
	}
}
