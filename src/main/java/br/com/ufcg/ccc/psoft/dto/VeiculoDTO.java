package br.com.ufcg.ccc.psoft.dto;

public class VeiculoDTO {

	private Long id;

	private String placaVeiculo;

	private String corVeiculo;

	private String Detalhes;

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
