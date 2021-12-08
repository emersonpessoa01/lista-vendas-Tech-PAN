package com.emersonpessoa.listavendasTECHPAN.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emersonpessoa.listavendasTECHPAN.entities.Cliente;
import com.emersonpessoa.listavendasTECHPAN.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<List<Cliente>>findAll(){
		clienteService.saveCliente();
		List<Cliente> lista = clienteService.findAll();
		return ResponseEntity.ok(lista);
	}

}
