package com.api.acessoescola.service;

import java.util.List;
import com.api.acessoescola.model.Escola;

public interface EscolaService {

	Escola saveEscola(Escola escola);

	List<Escola> getAllEscola();

	Escola getEscolaById(long id_escola);

	Escola updateEscola(Escola escola, long id_escola);

	void deleteEscola(long Id_escola);

}
