package com.emersonpessoa.listavendasTECHPAN.DTO;

import com.emersonpessoa.listavendasTECHPAN.entities.Cliente;

public class ClienteDTO {
	private int id;
	private String nome;
	private String dn;

	// capturar os atributos da entidade cliente
	public ClienteDTO(Cliente entidade) {
		this.id = entidade.getId();// passando as informações do atributo cliente para classe DTO
		this.nome = entidade.getNome();
		this.dn = entidade.getDn();
	}

	public ClienteDTO(int id, String nome, String dn) {
		this.id = id;
		this.nome = nome;
		this.dn = dn;
	}

	public ClienteDTO() {//add 

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDn() {
		return dn;
	}

	public void setDn(String dn) {
		this.dn = dn;
	}

}
