package com.emersonpessoa.listavendasTECHPAN.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emersonpessoa.listavendasTECHPAN.DTO.ClienteDTO;
import com.emersonpessoa.listavendasTECHPAN.entities.Cliente;
import com.emersonpessoa.listavendasTECHPAN.repositories.ClienteRepository;

//service sem banco de dados
@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;

	public List<ClienteDTO> findAll() {
		List<Cliente> resList = clienteRepository.findAll();
		return resList.stream().map(c -> new ClienteDTO(c)).collect(Collectors.toList());
	}

}
