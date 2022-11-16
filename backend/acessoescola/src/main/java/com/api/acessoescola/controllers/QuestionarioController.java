package com.api.acessoescola.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.acessoescola.model.Questionario;
import com.api.acessoescola.serviceImpl.QuestionarioServiceImpl;

@RestController
@RequestMapping("/api2")
@CrossOrigin("*")
public class QuestionarioController {

	@Autowired
	private QuestionarioServiceImpl service;

	// REQUEST TESTE
	@GetMapping("/quest")
	public String hello() {
		return "oi";
	}

	// localhost:8080/api2
	@GetMapping
	public ResponseEntity<List<Questionario>> findAll() {
		List<Questionario> questionario = service.getAllQuestionario();
		return ResponseEntity.ok().body(questionario);
	}

	// REQUEST POR ID
	// localhost:8080/api2/quest/1
	@GetMapping("{id_questionario}")
	public ResponseEntity<Questionario> getQuestionarioById_questionario(
			@PathVariable("id_questionario") long QuestionarioId) {
		return new ResponseEntity<Questionario>(service.getQuestionarioById(QuestionarioId), HttpStatus.OK);
	}

	// REQUEST PARA SALVAR
	// localhost:8080/api2/quest
	@PostMapping
	public ResponseEntity<Questionario> saveQuestionario(@RequestBody Questionario questionario) {
		return new ResponseEntity<Questionario>(service.saveQuestionario(questionario), HttpStatus.CREATED);
	}

	// REQUEST PARA ATUALIZAR
	// localhost:8080/api2/quest/1
	@PutMapping("{id_questionario}")
	public ResponseEntity<Questionario> updateQuestionario(@PathVariable("id_questionario") long QuestionarioId,
			@RequestBody Questionario questionario) {
		return new ResponseEntity<Questionario>(service.updateQuestionario(questionario, QuestionarioId),
				HttpStatus.OK);
	}

	// REQUEST PARA DELETAR
	@DeleteMapping("{id_questionario}")
	public ResponseEntity<String> deleteQuestionario(@PathVariable("id_questionario") long QuestionarioId) {
		service.deleteQuestionario(QuestionarioId);

		return new ResponseEntity<String>("deletado com sucesso.", HttpStatus.OK);
	}

}
