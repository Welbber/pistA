package br.com.ufcg.ccc.psoft.model;

import javax.persistence.*;

@Entity
public class Entregador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nomeCompleto;

	private String placaVeiculo;

	private String corVeiculo;

	private String status;

	private String codigoAcesso;

	// O entregador trabalha em um estabelecimento ou é melhor o pedido ter o
	// estabelecimento e o empregado entregar
//	@ManyToMany
//	private Estabelecimento estabelecimento;

	public Entregador() {
	}

	public Entregador(String nomeCompleto, String placaVeiculo, String corVeiculo, String status, String codigoAcesso) {
		this.nomeCompleto = nomeCompleto;
		this.placaVeiculo = placaVeiculo;
		this.corVeiculo = corVeiculo;
		this.status = status;
		this.codigoAcesso = codigoAcesso;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCodigoAcesso() {
		return codigoAcesso;
	}

	public void setCodigoAcesso(String codigoAcesso) {
		this.codigoAcesso = codigoAcesso;
	}
}
