package br.com.ufcg.ccc.psoft.dto;

import java.util.List;

import br.com.ufcg.ccc.psoft.model.Cliente;
import br.com.ufcg.ccc.psoft.model.Pagamento;

public class PedidoDTO {

	private Long id;
   	private Cliente cliente;
   	private List <String> Pizza;
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

	public List<String> getPizza() {
		return Pizza;
	}

	public void setPizza(List<String> pizza) {
		Pizza = pizza;
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
