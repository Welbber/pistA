package br.com.ufcg.ccc.psoft.model;

import javax.persistence.*;

@Entity
public class Entregador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nomeCompleto;

	@OneToOne
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

}
