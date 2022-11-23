package br.com.ufcg.ccc.psoft.service;

import br.com.ufcg.ccc.psoft.dto.EntregadorDTO;
import br.com.ufcg.ccc.psoft.exception.EntregadorAlreadyCreatedException;

public interface EntregadorService {

    public EntregadorDTO criaEntregador(EntregadorDTO entregadorDTO) throws EntregadorAlreadyCreatedException;

}
