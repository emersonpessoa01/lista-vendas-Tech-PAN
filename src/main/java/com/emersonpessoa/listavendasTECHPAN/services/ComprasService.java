package com.emersonpessoa.listavendasTECHPAN.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emersonpessoa.listavendasTECHPAN.DTO.ComprasDTO;
import com.emersonpessoa.listavendasTECHPAN.entities.Cliente;
import com.emersonpessoa.listavendasTECHPAN.entities.Compras;
import com.emersonpessoa.listavendasTECHPAN.repositories.ClienteRepository;
import com.emersonpessoa.listavendasTECHPAN.repositories.ComprasRepository;

@Service
public class ComprasService {
	@Autowired
	private ComprasRepository comprasRepository;

	// para listar tanto as informações do cliente quanto das compras.Evita o fluxo
	// da várias consultas no sql
	@Autowired
	private ClienteRepository clienteRepository; // add

	public List<ComprasDTO> findAll() {
		clienteRepository.findAll(); // add
		List<Compras> resList = comprasRepository.findAll();
		return resList.stream().map(c -> new ComprasDTO(c)).collect(Collectors.toList());
	}

	public Compras saveCompras(Compras compras) {
		return comprasRepository.save(compras);
	}
	
	//método PUT
		public Compras updateCompras(Integer id, Compras newCompras) {
			return comprasRepository.findById(id).map(c ->{
			c.setTotalCompra(newCompras.getTotalCompra());
			c.setDataCompra(newCompras.getDataCompra());
			Compras atualizado = comprasRepository.save(c);
			return atualizado;
			}).orElse(null);
		}
	

	public Compras fromDTO(ComprasDTO comprasDTO) {
		Compras entidade = new Compras(0, comprasDTO.getTotalCompra(), comprasDTO.getDataCompra(),
				new Cliente(comprasDTO.getCliente().getId(), null, null));
		return entidade;
	}
}
