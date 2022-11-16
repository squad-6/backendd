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

import com.api.acessoescola.model.Doacao;
import com.api.acessoescola.serviceImpl.DoacaoServiceImpl;


@RestController
@RequestMapping("/api3")
@CrossOrigin("*")
public class DoacaoController {

	@Autowired
	private DoacaoServiceImpl service;

	// REQUEST TESTE
	@GetMapping("/doacao")
	public String hello() {
		return "oi";
	}

	// localhost:8080/api3
	@GetMapping
	public ResponseEntity<List<Doacao>> findAll() {
		List<Doacao> doacao = service.getAllDoacao();
		return ResponseEntity.ok().body(doacao);
	}

	// REQUEST POR ID
	// localhost:8080/api3/doacao/1
	@GetMapping("{id_doacao}")
	public ResponseEntity<Doacao> getDoacaoById_doacao(
			@PathVariable("id_doacao") long DoacaoId) {
		return new ResponseEntity<Doacao>(service.getDoacaoById(DoacaoId), HttpStatus.OK);
	}

	// REQUEST PARA SALVAR
	// localhost:8080/api3/doacao
	@PostMapping
	public ResponseEntity<Doacao> saveDoacao(@RequestBody Doacao doacao) {
		return new ResponseEntity<Doacao>(service.saveDoacao(doacao), HttpStatus.CREATED);
	}

	// REQUEST PARA ATUALIZAR
	// localhost:8080/api3/doacao/1
	@PutMapping("{id_doacao}")
	public ResponseEntity<Doacao> updateDoacao(@PathVariable("id_doacao") long DoacaoId,
			@RequestBody Doacao doacao) {
		return new ResponseEntity<Doacao>(service.updateDoacao(doacao, DoacaoId),
				HttpStatus.OK);
	}

	// REQUEST PARA DELETAR
	@DeleteMapping("{id_doacao}")
	public ResponseEntity<String> deleteDoacao(@PathVariable("id_doacao") long DoacaoId) {
		service.deleteDoacao(DoacaoId);

		return new ResponseEntity<String>("deletado com sucesso.", HttpStatus.OK);
	}

}
