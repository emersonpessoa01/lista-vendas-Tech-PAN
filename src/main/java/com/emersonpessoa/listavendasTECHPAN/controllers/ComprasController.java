package com.emersonpessoa.listavendasTECHPAN.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emersonpessoa.listavendasTECHPAN.DTO.ComprasDTO;
import com.emersonpessoa.listavendasTECHPAN.services.ComprasService;

@RestController //VAI TER ENDPOINTS
@RequestMapping("/compras")
public class ComprasController {
	@Autowired
	private ComprasService comprasService;
	
	//codigo abaixo foi comentada para test e depois, descomentada
	@GetMapping
	public ResponseEntity<List<ComprasDTO>>findAll(){
		List<ComprasDTO> lista = comprasService.findAll();
		return ResponseEntity.ok(lista);
	}
	

}