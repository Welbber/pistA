package br.com.ufcg.ccc.psoft.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ufcg.ccc.psoft.model.Estabelecimento;
import br.com.ufcg.ccc.psoft.model.Sabor;

public class CardapioDTO {

	private Long id;
	
	@Autowired
    private List <Sabor> sabores;
    
    private Estabelecimento estabelecimento;
	
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Sabor> getSabores() {
		return sabores;
	}

	public void setSabor(List<Sabor> sabores) {
		this.sabores = sabores;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabeleciomento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	
}
