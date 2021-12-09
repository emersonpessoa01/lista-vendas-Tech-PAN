package com.emersonpessoa.listavendasTECHPAN.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.emersonpessoa.listavendasTECHPAN.entities.Cliente;

//repository sem banco de dados
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
