package com.api.acessoescola.service;

import java.util.List;

import com.api.acessoescola.model.Doacao;


public interface DoacaoService {

	Doacao saveDoacao(Doacao doacao);

	List<Doacao> getAllDoacao();

	Doacao getDoacaoById(long id_doacao);

	Doacao updateDoacao(Doacao doacao, long id_doacao);

	void deleteDoacao(long Id_doacao);

}
