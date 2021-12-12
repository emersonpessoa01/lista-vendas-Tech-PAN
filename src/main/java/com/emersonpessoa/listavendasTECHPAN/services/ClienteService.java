package com.emersonpessoa.listavendasTECHPAN.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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
	
	//método PUT
	public Cliente updateCliente(Integer id, Cliente newCliente) {
		return clienteRepository.findById(id).map(c ->{
		c.setNome(newCliente.getNome());
		c.setDn(newCliente.getDn());
		Cliente atualizado = clienteRepository.save(c);
		return atualizado;
		}).orElse(null);
	}
	
	// método DELETE
		public void deleteCliente(Integer id) {
			try {

				if (clienteRepository.findById(id) != null)
					clienteRepository.deleteById(id);
			} catch (DataIntegrityViolationException e) {// quando tentar deletar um cliente que tenha uma compra
				throw new DataIntegrityViolationException("Você não pode deletar um cliente que fez compras");
			}

		}

	// conversão de entidade para DTO
	public Cliente fromDTO(ClienteDTO clienteDTO) {
		Cliente entidade = new Cliente(0, clienteDTO.getNome(), clienteDTO.getDn());
		return entidade;

	}
}