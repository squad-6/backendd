package com.api.acessoescola.service;

import java.util.List;

import com.api.acessoescola.model.Questionario;

public interface QuestionarioService {

	Questionario saveQuestionario(Questionario questionario);

	List<Questionario> getAllQuestionario();

	Questionario getQuestionarioById(long id_questionario);

	Questionario updateQuestionario(Questionario questionario, long id_questionario);

	void deleteQuestionario(long Id_questionario);

}
