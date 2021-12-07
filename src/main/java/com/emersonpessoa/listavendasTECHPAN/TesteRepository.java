package com.emersonpessoa.listavendasTECHPAN;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TesteRepository extends JpaRepository<Cliente, Long> {

}
