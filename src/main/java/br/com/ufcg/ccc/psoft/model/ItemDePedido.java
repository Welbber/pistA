package br.com.ufcg.ccc.psoft.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class ItemDePedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Autowired
	@OneToMany
	private List<Sabor> sabores;

	private String tamanho; // medio ou grande

	private double valor;

	public ItemDePedido() {
	}

	// ItemDePedido com um sabor apenas

	public ItemDePedido(Sabor sabor, String tamanho, double valor) {
		this.sabores.add(sabor);
		this.tamanho = tamanho;
		this.valor = valor;
	}

	// ItemDePedido com 2 sabores
	public ItemDePedido(Sabor sabor1, Sabor sabor2, String tamanho, double valor) {
		this.sabores.add(sabor1);
		this.sabores.add(sabor2);
		this.tamanho = tamanho;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public List<Sabor> getSabores() {
		return sabores;
	}

	public String getTamanho() {
		return tamanho;
	}

	public double getValor() {
		return valor;
	}

}
