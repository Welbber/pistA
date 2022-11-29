package br.com.ufcg.ccc.psoft.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
public class Entregador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nomeCompleto;

	@OneToOne(targetEntity = Veiculo.class, cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Veiculo veiculo;

	private String status;

	private String codigoAcesso;

	public Entregador() {
	}

	public Entregador(String nomeCompleto, Veiculo veiculo, String status, String codigoAcesso) {
		this.nomeCompleto = nomeCompleto;
		this.veiculo = veiculo;
		this.status = status;
		this.codigoAcesso = codigoAcesso;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
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
