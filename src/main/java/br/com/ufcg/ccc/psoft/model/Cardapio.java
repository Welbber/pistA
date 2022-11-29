package br.com.ufcg.ccc.psoft.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Cardapio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List <Sabor> sabor;
	@OneToOne(targetEntity = Estabelecimento.class, cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Estabelecimento estabelecimento;
	
    public Cardapio(Long id, List<Sabor> sabor, Estabelecimento estabelecimento) {
		
		this.id = id;
		this.sabor = new ArrayList<>();
		this.estabelecimento = estabelecimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Sabor> getSabor() {
		return sabor;
	}
	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabeleciomento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
    
    
    
    
}