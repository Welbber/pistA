package br.com.ufcg.ccc.psoft.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.ufcg.ccc.psoft.dto.FuncionarioDTO;
import br.com.ufcg.ccc.psoft.exception.FuncionarioNotFoundException;
import br.com.ufcg.ccc.psoft.model.Funcionario;
import br.com.ufcg.ccc.psoft.repository.FuncionarioRepository;

public class FuncionarioServiceImpl implements FuncionarioService{

	@Autowired
	FuncionarioRepository funcionarioRepository;

    @Autowired
    public ModelMapper modelMapper;
    
    public FuncionarioDTO getFuncionarioById(Long id) throws FuncionarioNotFoundException {
    	Funcionario funcionario = getFuncionarioId(id);
		return modelMapper.map(funcionario, FuncionarioDTO.class);
	}
	
	public Funcionario getFuncionarioId(Long id) throws FuncionarioNotFoundException {
		return funcionarioRepository.findById(id)
				.orElseThrow(() -> new FuncionarioNotFoundException());
	}
	
	public FuncionarioDTO getNomeCompletoByCpf(String nomeCompleto) throws FuncionarioNotFoundException {
		Funcionario funcionario = funcionarioRepository.findBynomeCompleto(nomeCompleto)
				.orElseThrow(() -> new FuncionarioNotFoundException());
		return modelMapper.map(funcionario, FuncionarioDTO.class);
	}
		

	private void salvarEstabelecimentoCadastrado(Funcionario funcionario) {
		funcionarioRepository.save(funcionario);		
	}
	
	

	
    
    
}




