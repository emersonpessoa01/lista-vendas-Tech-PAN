package com.emersonpessoa.listavendasTECHPAN.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	@GetMapping
	public String teste() {
		return "Olá, Emerson Pessoa";
	}

}