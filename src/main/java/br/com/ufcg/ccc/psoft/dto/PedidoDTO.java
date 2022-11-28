package br.com.ufcg.ccc.psoft.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ufcg.ccc.psoft.model.Cliente;
import br.com.ufcg.ccc.psoft.model.Pagamento;
import br.com.ufcg.ccc.psoft.model.Sabor;

public class PedidoDTO {

	private Long id;
	
   	private Cliente cliente;
   	
   	@Autowired
   	private List <Sabor> pizzas;
   	
    private Pagamento pagamento;
    
    private String status;
    
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Sabor> getPizzas() {
		return pizzas;
	}

	public void setPizzas(List<Sabor> pizzas) {
		this.pizzas = pizzas;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
}
