package br.com.ufcg.ccc.psoft.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ufcg.ccc.psoft.model.Sabor;

public class ItemDePedidoDTO {

	private Long id;

	@Autowired
	private List<Sabor> sabores;
	
	private String tamanho; //medio ou grande
	
	private double valor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Sabor> getSabores() {
		return sabores;
	}

	public void setSabores(List<Sabor> sabores) {
		this.sabores = sabores;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
