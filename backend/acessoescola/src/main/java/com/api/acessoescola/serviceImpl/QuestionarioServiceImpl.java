package com.api.acessoescola.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.acessoescola.excepction.ResourceNotFoundException;
import com.api.acessoescola.model.Questionario;
import com.api.acessoescola.repositories.QuestionarioRepository;
import com.api.acessoescola.service.QuestionarioService;



@Service
public class QuestionarioServiceImpl implements QuestionarioService {

	@Autowired
	private QuestionarioRepository questionarioRepository;

	@Override
	public Questionario saveQuestionario(Questionario questionario) {
		return questionarioRepository.save(questionario);
	}

	@Override
	public List<Questionario> getAllQuestionario() {
		return questionarioRepository.findAll();
	}

	@Override
	public Questionario getQuestionarioById(long id_questionario) {
		return questionarioRepository.findById(id_questionario)
				.orElseThrow(() -> new ResourceNotFoundException("Questionario", "id_questionario", id_questionario));
	}

	@Override
	public Questionario updateQuestionario(Questionario questionario, long id_questionario) {

		Questionario questionarioExistente = questionarioRepository.findById(id_questionario)
				.orElseThrow(() -> new ResourceNotFoundException("Questionario", "id_questionario", id_questionario));

		questionarioExistente.setPergunta1(questionario.getPergunta1());
		
		questionarioExistente.setPergunta2(questionario.getPergunta2());
		
		questionarioExistente.setPergunta3(questionario.getPergunta3());
		
		questionarioExistente.setPergunta4(questionario.getPergunta4());

		questionarioExistente.setData_questionario(questionario.getData_questionario());

		questionarioRepository.save(questionarioExistente);
		return questionarioExistente;
	}

	
	@Override
	public void deleteQuestionario(long id_questionario) {

		questionarioRepository.findById(id_questionario)
				.orElseThrow(() -> new ResourceNotFoundException("questionario", "id_escola", id_questionario));

		questionarioRepository.deleteById(id_questionario);
	}

}
