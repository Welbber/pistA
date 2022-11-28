package br.com.ufcg.ccc.psoft.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private Cliente cliente;

	@Autowired
	@OneToOne
	private List<ItemDePedido> pizzas;

	@OneToOne
	private Pagamento pagamento;

	private String status;

	public Pedido(Long id, Cliente cliente, Pagamento pagamento, String status) {

		this.id = id;
		this.cliente = cliente;
		this.pagamento = pagamento;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<ItemDePedido> getPizza() {
		return pizzas;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void adicionaItemDePedido(ItemDePedido itemDePedido) {
		this.pizzas.add(itemDePedido);
	}

}
