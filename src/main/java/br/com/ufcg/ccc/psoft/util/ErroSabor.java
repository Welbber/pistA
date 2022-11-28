package br.com.ufcg.ccc.psoft.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ErroSabor {

	static final String SABOR_NAO_ENCONTRADO = "Sabor com id %s não foi encontrado.";
	
	public static ResponseEntity<CustomErrorType> erroProdutoNaoEncontradoNoCarrinho(long id) {
		return new ResponseEntity<CustomErrorType>(new CustomErrorType(String.format(ErroSabor.SABOR_NAO_ENCONTRADO, id)),
				HttpStatus.NOT_FOUND);
	}
	

}
