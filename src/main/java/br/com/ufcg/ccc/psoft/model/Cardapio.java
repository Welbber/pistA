package br.com.ufcg.ccc.psoft.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cardapio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private List <String> Sabor;
    private Estabelecimento estabelecimento;
	
    public Cardapio(Long id, List<String> sabor, Estabelecimento estabelecimento) {
		
		this.id = id;
		Sabor = sabor;
		this.estabelecimento = estabelecimento;
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

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabeleciomento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
    
    
    
    
}
