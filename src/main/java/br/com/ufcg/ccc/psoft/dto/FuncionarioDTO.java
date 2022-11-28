package br.com.ufcg.ccc.psoft.dto;


import br.com.ufcg.ccc.psoft.model.Estabelecimento;

public class FuncionarioDTO {

	 
	    private Long id;

	    private String nomeCompleto;

	    private String codigoAcesso;

	    private Estabelecimento estabelecimento;

	  
	    public Long getId() {
	        return id;
	    }

	    public String getNomeCompleto() {
	        return nomeCompleto;
	    }

	    public String getCodigoAcesso() {
	        return codigoAcesso;
	    }

	    public Estabelecimento getEstabelecimento() {
	        return estabelecimento;
	    }

	    public void setNomeCompleto(String nomeCompleto) {
	        this.nomeCompleto = nomeCompleto;
	    }

	    public void setCodigoAcesso(String codigoAcesso) {
	        this.codigoAcesso = codigoAcesso;
	    }

	    public void setEstabelecimento(Estabelecimento estabelecimento) {
	        this.estabelecimento = estabelecimento;
	    }
	
}