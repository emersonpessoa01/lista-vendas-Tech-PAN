package com.emersonpessoa.listavendasTECHPAN.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.criteria.From;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emersonpessoa.listavendasTECHPAN.DTO.ClienteDTO;
import com.emersonpessoa.listavendasTECHPAN.entities.Cliente;
import com.emersonpessoa.listavendasTECHPAN.repositories.ClienteRepository;

//service com banco de dados
@Service
public class ClienteService { // classe para métodos http
	@Autowired
	private ClienteRepository clienteRepository;

	// método GET
	public List<ClienteDTO> findAll() {
		List<Cliente> resList = clienteRepository.findAll();
		return resList.stream().map(c -> new ClienteDTO(c)).collect(Collectors.toList());
	}

	// método POST
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	// conversão de entidade para DTO
	public Cliente fromDTO(ClienteDTO clienteDTO) {
		Cliente entidade = new Cliente(0, clienteDTO.getNome(), clienteDTO.getDn());
		return entidade;

	}
}
