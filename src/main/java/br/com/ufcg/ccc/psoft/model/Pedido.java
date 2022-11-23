package br.com.ufcg.ccc.psoft.model;

import java.util.List;

import javax.persistence.Id;

public class Pedido {

	   @Id
	    private Long id;
	   	private Cliente cliente;
	   	private List <String> Pizza;
	    private Pagamento pagamento;
	    private String status;
	    
		public Pedido(Long id, Cliente cliente, List<String> pizza, Pagamento pagamento, String status) {

			this.id = id;
			this.cliente = cliente;
			Pizza = pizza;
			this.pagamento = pagamento;
			this.status = status;
		}

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
