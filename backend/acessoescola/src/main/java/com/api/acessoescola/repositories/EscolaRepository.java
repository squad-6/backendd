package com.api.acessoescola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.acessoescola.model.Escola;

	@Repository
	public interface EscolaRepository extends JpaRepository<Escola, Long> {

	}



