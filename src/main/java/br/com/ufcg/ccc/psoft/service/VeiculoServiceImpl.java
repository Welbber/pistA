package br.com.ufcg.ccc.psoft.service;

import br.com.ufcg.ccc.psoft.dto.VeiculoDTO;
import br.com.ufcg.ccc.psoft.model.Veiculo;
import br.com.ufcg.ccc.psoft.repository.VeiculoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoServiceImpl implements VeiculoService {

    @Autowired
    VeiculoRepository veiculoRepository;

    public Veiculo criaVeiculo(Veiculo veiculo) {
        Veiculo v = new Veiculo(veiculo.getPlacaVeiculo(), veiculo.getCorVeiculo(), veiculo.getDetalhes());
        salvarVeiculoCadastrado(v);
        return v;
    }

    private Veiculo salvarVeiculoCadastrado(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

}
