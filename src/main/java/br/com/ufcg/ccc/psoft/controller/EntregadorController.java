package br.com.ufcg.ccc.psoft.controller;

import br.com.ufcg.ccc.psoft.dto.EntregadorDTO;
import br.com.ufcg.ccc.psoft.exception.EntregadorAlreadyCreatedException;
import br.com.ufcg.ccc.psoft.service.EntregadorService;
import br.com.ufcg.ccc.psoft.util.ErroEntregador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EntregadorController {

    @Autowired
    EntregadorService entregadorService;


    @PostMapping(value = "/entregador/")
    public ResponseEntity<?> criarEntregador(@RequestBody EntregadorDTO entregadorDTO) {
        try {
            EntregadorDTO entregador = entregadorService.criaEntregador(entregadorDTO);
            return new ResponseEntity<EntregadorDTO>(entregador, HttpStatus.CREATED);
        } catch (EntregadorAlreadyCreatedException e) {
            return ErroEntregador.erroEntregadorJaCadastrado(entregadorDTO);
        }
    }

}
