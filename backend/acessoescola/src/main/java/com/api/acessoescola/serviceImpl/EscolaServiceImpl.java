package com.api.acessoescola.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.acessoescola.excepction.ResourceNotFoundException;
import com.api.acessoescola.model.Escola;
import com.api.acessoescola.repositories.EscolaRepository;
import com.api.acessoescola.service.EscolaService;

@Service
public class EscolaServiceImpl implements EscolaService {

	@Autowired
	private EscolaRepository escolaRepository;

	@Override
	public Escola saveEscola(Escola escola) {
		return escolaRepository.save(escola);
	}

	@Override
	public List<Escola> getAllEscola() {
		return escolaRepository.findAll();
	}

	@Override
	public Escola getEscolaById(long id_escola) {
		return escolaRepository.findById(id_escola)
				.orElseThrow(() -> new ResourceNotFoundException("Escola", "id_escola", id_escola));
	}

	@Override
	public Escola updateEscola(Escola escola, long id_escola) {

		Escola escolaExistente = escolaRepository.findById(id_escola)
				.orElseThrow(() -> new ResourceNotFoundException("Escola", "id_escola", id_escola));

		escolaExistente.setNome_escola(escola.getNome_escola());

		escolaExistente.setEstado_escola(escola.getEstado_escola());

		escolaExistente.setCidade_escola(escola.getCidade_escola());

		escolaExistente.setTelefone_escola(escola.getTelefone_escola());

		escolaExistente.setCep_escola(escola.getCep_escola());

		escolaExistente.setNumero_escola(escola.getNumero_escola());

		escolaExistente.setEmail_escola(escola.getEmail_escola());

		escolaExistente.setSenha_escola(escola.getSenha_escola());

		escolaRepository.save(escolaExistente);
		return escolaExistente;
	}

	
	@Override
	public void deleteEscola(long id_escola) {

		escolaRepository.findById(id_escola)
				.orElseThrow(() -> new ResourceNotFoundException("escola", "id_escola", id_escola));

		escolaRepository.deleteById(id_escola);
	}

}
