package br.com.ufcg.ccc.psoft.dto;

import br.com.ufcg.ccc.psoft.model.Veiculo;

public class EntregadorDTO {

	private Long id;

	private String nomeCompleto;

	private Veiculo veiculo;

	private String status;

	private String codigoAcesso;

	public Long getId() {
		return id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public String getStatus() {
		return status;
	}

	public String getCodigoAcesso() {
		return codigoAcesso;
	}
}
