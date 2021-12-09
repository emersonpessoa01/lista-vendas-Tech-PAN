package com.emersonpessoa.listavendasTECHPAN.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.emersonpessoa.listavendasTECHPAN.entities.Compras;

@Repository
public interface ComprasRepository extends JpaRepository<Compras, Integer> {

}
