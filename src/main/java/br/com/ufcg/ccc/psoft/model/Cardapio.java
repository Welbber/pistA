package br.com.ufcg.ccc.psoft.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Cardapio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Autowired
    @OneToMany
    private List <Sabor> sabores;
    
    @OneToOne
    private Estabelecimento estabelecimento;
	
    public Cardapio() {}
    
    public Cardapio(Long id, Estabelecimento estabelecimento) {
		this.id = id;
		this.estabelecimento = estabelecimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Sabor> getSabores() {
		return sabores;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabeleciomento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
    
    public void adicionaSabor(Sabor sabor) {
    	this.sabores.add(sabor);
    }
    
    
}
