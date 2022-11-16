package com.api.acessoescola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.acessoescola.model.FaleConosco;


	@Repository
	public interface FaleConoscoRepository extends JpaRepository<FaleConosco, Long> {

	}



