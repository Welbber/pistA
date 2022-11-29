package br.com.ufcg.ccc.psoft.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nomeCompleto;

	private String codigoAcesso;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<Estabelecimento> estabelecimento;

	public Funcionario() {
	}

	public Funcionario(Long id, String nomeCompleto, String codigoAcesso, List<Estabelecimento> estabelecimento) {
		this.id = id;
		this.nomeCompleto = nomeCompleto;
		this.codigoAcesso = codigoAcesso;
		this.estabelecimento = new ArrayList<>();
	}

	public Long getId() {
		return id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getCodigoAcesso() {
		return codigoAcesso;
	}

	public List<Estabelecimento> getEstabelecimento() {
		return estabelecimento;
	}

}
