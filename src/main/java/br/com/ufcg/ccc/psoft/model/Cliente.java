package br.com.ufcg.ccc.psoft.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nomeCompleto;

	private String enderecoPrincipal;

	private String codAcesso;

	@Autowired
	@OneToMany
	private List<Pedido> pedidos;

	public Cliente() {
	}

	public Cliente(String nomeCompleto, String enderecoPrincipal, String codAcesso) {

		this.nomeCompleto = nomeCompleto;
		this.enderecoPrincipal = enderecoPrincipal;
		this.codAcesso = codAcesso;
	}

	public Long getId() {
		return id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getEnderecoPrincipal() {
		return enderecoPrincipal;
	}

	public String getCodAcesso() {
		return codAcesso;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void adicionaPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}

}
