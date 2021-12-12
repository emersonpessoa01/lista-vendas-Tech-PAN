package com.emersonpessoa.listavendasTECHPAN.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.emersonpessoa.listavendasTECHPAN.DTO.RankingComprasDTO;
import com.emersonpessoa.listavendasTECHPAN.entities.Compras;



@Repository
public interface ComprasRepository extends JpaRepository<Compras, Integer> {
	@Query("SELECT new com.emersonpessoa.listavendasTECHPAN.DTO.RankingComprasDTO(compras.cliente, SUM(compras.totalCompra)) "
			+ "FROM Compras AS compras GROUP BY compras.cliente")
	List<RankingComprasDTO>findRanking();
}
