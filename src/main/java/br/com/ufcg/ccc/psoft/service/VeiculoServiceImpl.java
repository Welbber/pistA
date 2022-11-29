package br.com.ufcg.ccc.psoft.service;

import br.com.ufcg.ccc.psoft.model.Veiculo;
import br.com.ufcg.ccc.psoft.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoServiceImpl implements VeiculoService {

    @Autowired
    VeiculoRepository veiculoRepository;

    public Veiculo criaVeiculo(Veiculo veiculo) {
        return salvarVeiculoCadastrado(veiculo);
    }

    private Veiculo salvarVeiculoCadastrado(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

}
