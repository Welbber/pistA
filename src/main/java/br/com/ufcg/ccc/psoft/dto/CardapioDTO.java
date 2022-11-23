package br.com.ufcg.ccc.psoft.dto;

import java.util.List;

import br.com.ufcg.ccc.psoft.model.Estabelecimento;

public class CardapioDTO {

	private Long id;
    private List <String> Sabor;
    private Estabelecimento estabeleciomento;
	
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getSabor() {
		return Sabor;
	}

	public void setSabor(List<String> sabor) {
		Sabor = sabor;
	}

	public Estabelecimento getEstabeleciomento() {
		return estabeleciomento;
	}

	public void setEstabeleciomento(Estabelecimento estabeleciomento) {
		this.estabeleciomento = estabeleciomento;
	}
	
}
