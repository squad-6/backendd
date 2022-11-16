package com.api.acessoescola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.acessoescola.model.Questionario;

	@Repository
	public interface QuestionarioRepository extends JpaRepository<Questionario, Long> {

	}



