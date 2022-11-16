package com.api.acessoescola.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.acessoescola.excepction.ResourceNotFoundException;
import com.api.acessoescola.model.FaleConosco;
import com.api.acessoescola.repositories.FaleConoscoRepository;
import com.api.acessoescola.service.FaleConoscoService;

@Service
public class FaleConoscoServiceImpl implements FaleConoscoService {

	@Autowired
	private FaleConoscoRepository faleConoscoRepository;

	@Override
	public FaleConosco saveFaleConosco(FaleConosco faleConosco) {
		return faleConoscoRepository.save(faleConosco);
	}

	@Override
	public List<FaleConosco> getAllFaleConosco() {
		return faleConoscoRepository.findAll();
	}

	@Override
	public FaleConosco getFaleConoscoById(long id) {
		return faleConoscoRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("FaleConosco", "id", id));
	}

	@Override
	public FaleConosco updateFaleConosco(FaleConosco faleConosco, long id) {

		FaleConosco faleConoscoExistente = faleConoscoRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("FaleConosco", "id", id));

		faleConoscoExistente.setNome(faleConosco.getNome());

		faleConoscoExistente.setEmail(faleConosco.getEmail());

		faleConoscoExistente.setMenssagem(faleConosco.getMenssagem());

		faleConoscoRepository.save(faleConoscoExistente);
		return faleConoscoExistente;
	}

	@Override
	public void deleteFaleConosco(long id) {

		faleConoscoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("faleConosco", "id", id));

		faleConoscoRepository.deleteById(id);
	}

}
