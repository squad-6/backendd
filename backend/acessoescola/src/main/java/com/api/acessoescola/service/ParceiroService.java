package com.api.acessoescola.service;

import java.util.List;
import com.api.acessoescola.model.Parceiro;

public interface ParceiroService {

	Parceiro saveParceiro(Parceiro parceiro);

	List<Parceiro> getAllParceiro();

	Parceiro getParceiroById(long id_parceiro);

	Parceiro updateParceiro(Parceiro parceiro, long id_parceiro);

	void deleteParceiro(long id_parceiro);

}