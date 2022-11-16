package com.api.acessoescola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.acessoescola.model.Parceiro;

@Repository
public interface ParceiroRepository extends JpaRepository<Parceiro, Long> {

}
