package br.com.ufcg.ccc.psoft.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {

	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

		@ManyToOne(targetEntity = Cliente.class)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	   	private Cliente cliente;

		@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private List <Sabor> sabores;
		@OneToOne(targetEntity = Pagamento.class, cascade = CascadeType.ALL, orphanRemoval = true)
		@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
		private Pagamento pagamento;
	    private String status;
	    
		public Pedido(Long id, Cliente cliente, List<Sabor> sabores, Pagamento pagamento, String status) {

			this.id = id;
			this.cliente = cliente;
			this.sabores = new ArrayList<>();
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

		public List<Sabor> getSabores() {
			return sabores;
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