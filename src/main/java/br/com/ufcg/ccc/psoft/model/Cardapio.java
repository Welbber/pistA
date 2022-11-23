package br.com.ufcg.ccc.psoft.model;

import java.util.List;

import javax.persistence.Id;

public class Cardapio {
    @Id
    private Long id;
    private List <String> Sabor;
    private Estabelecimento estabeleciomento;
	
    public Cardapio(Long id, List<String> sabor, Estabelecimento estabeleciomento) {
		
		this.id = id;
		Sabor = sabor;
		this.estabeleciomento = estabeleciomento;
	}

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
