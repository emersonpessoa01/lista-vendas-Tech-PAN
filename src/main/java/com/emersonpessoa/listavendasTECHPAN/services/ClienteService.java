package com.emersonpessoa.listavendasTECHPAN.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.el.parser.AstListData;
import org.springframework.stereotype.Service;

import com.emersonpessoa.listavendasTECHPAN.entities.Cliente;
import com.emersonpessoa.listavendasTECHPAN.repositories.ClienteRepository;

//service sem banco de dados
@Service
public class ClienteService implements ClienteRepository {
	List<Cliente> lista = new ArrayList<>();

	@Override
	public List<Cliente> findAll() {
		return lista;
	}

	@Override
	public Cliente saveCliente() {
		Cliente c1 = new Cliente(0, "", "");
		c1.setId(1);
		c1.setNome("Fernanda Ferreira");
		c1.setDn("19/04/1996");

		Cliente c2 = new Cliente(0, "", "");
		c2.setId(2);
		c2.setNome("Dominique Pessoa");
		c2.setDn("09/01/2011");

		lista = Arrays.asList(c1, c2);
		return null;
	}

}
