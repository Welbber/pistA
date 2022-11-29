package br.com.ufcg.ccc.psoft.service;

import java.util.List;

import br.com.ufcg.ccc.psoft.dto.SaborDTO;
import br.com.ufcg.ccc.psoft.exception.SaborAlreadyCreatedException;
import br.com.ufcg.ccc.psoft.exception.SaborNotFoundException;
import br.com.ufcg.ccc.psoft.model.Sabor;

public interface SaborService {

	public SaborDTO getSaborById(Long id) throws SaborNotFoundException;
	
	public Sabor getSaborId(Long id) throws SaborNotFoundException;
	
	public SaborDTO getSaborByNomeSabor(String nomeSabor) throws SaborNotFoundException;
	
	public void removerSaborCadastrado(Long id) throws SaborNotFoundException;

	public List<SaborDTO> listarSabores();
	
	public SaborDTO criarSabor( SaborDTO saborDTO) throws SaborAlreadyCreatedException;
	
	public SaborDTO atualizarSabor(Long id, SaborDTO saborDTO) throws SaborNotFoundException;
	
}
