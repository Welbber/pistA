package br.com.ufcg.ccc.psoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ufcg.ccc.psoft.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
