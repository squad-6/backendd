package com.api.acessoescola.service;

import java.util.List;

import com.api.acessoescola.model.FaleConosco;

public interface FaleConoscoService {

	FaleConosco saveFaleConosco(FaleConosco faleConosco);


	List<FaleConosco> getAllFaleConosco();

	FaleConosco getFaleConoscoById(long id);

	FaleConosco updateFaleConosco(FaleConosco faleConosco, long id);

	void deleteFaleConosco(long Id);



}
