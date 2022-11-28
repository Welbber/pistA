package br.com.ufcg.ccc.psoft.model;

import javax.persistence.Id;

public class Cliente {

    @Id
    private Long id;

    private String codAcesso;

    private String nomeCompleto;

    private String enderecoPrincipal;


}