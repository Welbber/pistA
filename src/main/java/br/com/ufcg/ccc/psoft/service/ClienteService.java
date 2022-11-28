package br.com.ufcg.ccc.psoft.service;

import br.com.ufcg.ccc.psoft.dto.ClienteDTO;

import java.util.List;

public interface ClienteService {

    public ClienteDTO getClienteById(Long id);

    public void removerClienteCadastrado(Long id);

    public List<ClienteDTO> listarClientes();

    public ClienteDTO criaCliente(ClienteDTO clienteDTO);

    public ClienteDTO atualizaCliente(Long id, ClienteDTO clienteDTO) ;

}
