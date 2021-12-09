package com.emersonpessoa.listavendasTECHPAN.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emersonpessoa.listavendasTECHPAN.DTO.ComprasDTO;
import com.emersonpessoa.listavendasTECHPAN.entities.Compras;
import com.emersonpessoa.listavendasTECHPAN.repositories.ComprasRepository;

@Service
public class ComprasService {
	@Autowired
	private ComprasRepository comprasRepository;

	public List<ComprasDTO> findAll() {
		List<Compras> resList = comprasRepository.findAll();
		return resList.stream().map(c -> new ComprasDTO(c)).collect(Collectors.toList());
	}
}
