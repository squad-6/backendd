package com.api.acessoescola.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.acessoescola.excepction.ResourceNotFoundException;
import com.api.acessoescola.model.Parceiro;
import com.api.acessoescola.repositories.ParceiroRepository;
import com.api.acessoescola.service.ParceiroService;

@Service
public class ParceiroServiceImpl implements ParceiroService {

	@Autowired
	private ParceiroRepository parceiroRepository;

	@Override
	public Parceiro saveParceiro(Parceiro parceiro) {
		return parceiroRepository.save(parceiro);
	}

	@Override
	public List<Parceiro> getAllParceiro() {
		return parceiroRepository.findAll();
	}

	@Override
	public Parceiro getParceiroById(long id_parceiro) {
		return parceiroRepository.findById(id_parceiro)
				.orElseThrow(() -> new ResourceNotFoundException("Parceiro", "id_parceiro", id_parceiro));
	}

	@Override
	public Parceiro updateParceiro(Parceiro parceiro, long id_parceiro) {

		Parceiro parceiroExistente = parceiroRepository.findById(id_parceiro)
				.orElseThrow(() -> new ResourceNotFoundException("Parceiro", "id_parceiro", id_parceiro));

		parceiroExistente.setNome_parceiro(parceiro.getNome_parceiro());
		parceiroExistente.setEstado_parceiro(parceiro.getEstado_parceiro());
		parceiroExistente.setCidade_parceiro(parceiro.getCidade_parceiro());
		parceiroExistente.setEmail_parceiro(parceiro.getEmail_parceiro());
		parceiroExistente.setSenha_parceiro(parceiro.getSenha_parceiro());
		parceiroExistente.setRamo_atividade_parceiro(parceiro.getRamo_atividade_parceiro());
		parceiroExistente.setItem_parceiro(parceiro.getItem_parceiro());
		parceiroRepository.save(parceiroExistente);
		return parceiroExistente;
	}

	@Override
	public void deleteParceiro(long id_parceiro) {

		parceiroRepository.findById(id_parceiro)
				.orElseThrow(() -> new ResourceNotFoundException("Parceiro", "id_parceiro", id_parceiro));

		parceiroRepository.deleteById(id_parceiro);

	}

}