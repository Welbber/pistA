package br.com.ufcg.ccc.psoft.dto;

import java.util.List;

import br.com.ufcg.ccc.psoft.model.Estabelecimento;

public class CardapioDTO {

	private Long id;
    private List <String> Sabor;
    private Estabelecimento estabelecimento;
	
    
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

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabeleciomento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	
}
