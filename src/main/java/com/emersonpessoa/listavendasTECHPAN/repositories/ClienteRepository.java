package com.emersonpessoa.listavendasTECHPAN.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.emersonpessoa.listavendasTECHPAN.entities.Cliente;

//repository sem banco de dados
@Repository
public interface ClienteRepository {
	public List<Cliente>findAll();
	public Cliente saveCliente();
	

}
