package com.emersonpessoa.listavendasTECHPAN;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Cliente {
	@Id
	private Long id;
	
	@Autowired
	TesteRepository testeRepository;
	
	public void Salvar(Cliente cliente) {
		testeRepository.save(cliente);
	}
}
