package com.api.acessoescola.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.acessoescola.excepction.ResourceNotFoundException;
import com.api.acessoescola.model.Doacao;
import com.api.acessoescola.repositories.DoacaoRepository;
import com.api.acessoescola.service.DoacaoService;

@Service
public class DoacaoServiceImpl implements DoacaoService {

	@Autowired
	private DoacaoRepository doacaoRepository;

	@Override
	public Doacao saveDoacao(Doacao doacao) {
		return doacaoRepository.save(doacao);
	}

	@Override
	public List<Doacao> getAllDoacao() {
		return doacaoRepository.findAll();
	}

	@Override
	public Doacao getDoacaoById(long id_doacao) {
		return doacaoRepository.findById(id_doacao)
				.orElseThrow(() -> new ResourceNotFoundException("Doacao", "id_doacao", id_doacao));
	}

	@Override
	public Doacao updateDoacao(Doacao doacao, long id_doacao) {

		Doacao doacaoExistente = doacaoRepository.findById(id_doacao)
				.orElseThrow(() -> new ResourceNotFoundException("Doacao", "id_doacao", id_doacao));

		doacaoExistente.setNome_doacao(doacao.getNome_doacao());

//		doacaoExistente.setEscola(doacao.getEscola());
//	
//		doacaoExistente.setParceiro(doacao.getParceiro());
		

//		Editoras e2 = new Editoras(posicao, nome);
//		editoraDAO.update(e2);
	

		doacaoRepository.save(doacaoExistente);
		return doacaoExistente;
	}

	@Override
	public void deleteDoacao(long id_doacao) {

		doacaoRepository.findById(id_doacao)
				.orElseThrow(() -> new ResourceNotFoundException("doacao", "id_doacao", id_doacao));

		doacaoRepository.deleteById(id_doacao);
	}

}
