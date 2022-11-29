package br.com.ufcg.ccc.psoft.service;

import br.com.ufcg.ccc.psoft.dto.EntregadorDTO;
import br.com.ufcg.ccc.psoft.exception.EntregadorAlreadyCreatedException;
import br.com.ufcg.ccc.psoft.exception.EntregadorNotFoundException;
import br.com.ufcg.ccc.psoft.model.Entregador;
import br.com.ufcg.ccc.psoft.repository.EntregadorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntregadorServiceImpl implements EntregadorService {

    @Autowired
    private EntregadorRepository entregadorRepository;

    @Autowired
    public ModelMapper modelMapper;

    public EntregadorDTO criaEntregador(EntregadorDTO entregadorDTO) throws EntregadorAlreadyCreatedException {

        if(isEntregadorCadastrado(entregadorDTO.getNomeCompleto())) {
            throw new EntregadorAlreadyCreatedException();
        }

        Entregador entregador = new Entregador(entregadorDTO.getNomeCompleto(), entregadorDTO.getPlacaVeiculo(), entregadorDTO.getCorVeiculo(), entregadorDTO.getStatus(), entregadorDTO.getCodigoAcesso());

        salvarEntregadorCadastrado(entregador);

        return modelMapper.map(entregador, EntregadorDTO.class);
    }

    private boolean isEntregadorCadastrado(String nome) {
        try {
            getEntregadorByNomeCompleto(nome);
            return true;
        } catch (EntregadorNotFoundException e) {
            return false;
        }
    }

    public EntregadorDTO getEntregadorByNomeCompleto(String codigo) throws EntregadorNotFoundException {
        Entregador entregador = entregadorRepository.findByNomeCompleto(codigo)
                .orElseThrow(() -> new EntregadorNotFoundException());
        return modelMapper.map(entregador, EntregadorDTO.class);
    }

    private void salvarEntregadorCadastrado(Entregador entregador) {
        entregadorRepository.save(entregador);
    }

}
