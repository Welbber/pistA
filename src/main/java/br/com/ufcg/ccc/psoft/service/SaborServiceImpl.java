package br.com.ufcg.ccc.psoft.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufcg.ccc.psoft.dto.SaborDTO;
import br.com.ufcg.ccc.psoft.exception.SaborNotFoundException;
import br.com.ufcg.ccc.psoft.model.Sabor;
import br.com.ufcg.ccc.psoft.repository.SaborRepository;

@Service
public class SaborServiceImpl implements SaborService{
	
	@Autowired
	private SaborRepository saborRepository;
	
	@Autowired
	public ModelMapper modelMapper;

	public SaborDTO getSaborById(Long id) throws SaborNotFoundException {
		Sabor sabor = getSaborId(id);
		return modelMapper.map(sabor, SaborDTO.class);
	}
	
	public Sabor getSaborId(Long id) throws SaborNotFoundException {
		return saborRepository.findById(id)
				.orElseThrow(() -> new SaborNotFoundException());
	}
	
	public SaborDTO getSaborByNomeSabor(String nomeSabor) throws SaborNotFoundException {
		Sabor sabor = saborRepository.findByNomeSabor(nomeSabor)
				.orElseThrow(() -> new SaborNotFoundException());
		return modelMapper.map(sabor, SaborDTO.class);
	}
		
	public void removerSaborCadastrado(Long id) throws SaborNotFoundException {
		Sabor sabor = getSaborId(id);
		saborRepository.delete(sabor);
	}

	public SaborDTO criarSabor( SaborDTO saborDTO) throws SaborAlreadyCreatedException {

		if (isSaborCadastrado(saborDTO.getId())) {
			throw new SaborAlreadyCreatedException();
		}

		Sabor sabor = new Sabor(saborDTO.getNomeSabor(),saborDTO.getTipo(),saborDTO.getValorMedio(),saborDTO.getValorGrande());

		salvarSabor(sabor);

		return modelMapper.map(sabor,  SaborDTO.class);
	}
	
	private void salvarSabor(Sabor sabor) {
		saborRepository.save(sabor);		
	}
	
	public List<SaborDTO> listarSabores() {
		List<SaborDTO> sabores = saborRepository.findAll()
				.stream()
				.map(sabor -> modelMapper.map(sabor, SaborDTO.class))
				.collect(Collectors.toList());
		return sabores;
	}


	
	private boolean isSaborCadastrado(Long id) {
		try {
			getSaborById(id);
			return true;
		} catch (SaborNotFoundException e) {
			return false;
		}
	}

	public SaborDTO atualizarSabor(Long idSabor, SaborDTO saborDTO) throws SaborNotFoundException{

			Sabor sabor = getSaborId(idSabor);

			sabor.setNomeSabor(saborDTO.getNomeSabor());
			sabor.setTipo(saborDTO.getTipo());
			sabor.setValorMedio(saborDTO.getValorMedio());
			sabor.setValorGrande(saborDTO.getValorGrande());
			
			salvarSabor(sabor);

			return modelMapper.map(sabor, SaborDTO.class);
		}
	
}
