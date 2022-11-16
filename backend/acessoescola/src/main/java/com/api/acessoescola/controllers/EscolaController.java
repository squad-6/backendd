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
import com.api.acessoescola.model.Escola;
import com.api.acessoescola.serviceImpl.EscolaServiceImpl;

@RestController
@RequestMapping("/escola")
@CrossOrigin("*")
public class EscolaController {

	@Autowired
	private EscolaServiceImpl service;

	// REQUEST TESTE
	@GetMapping("/home")
	public String hello() {
		return "oi";
	}

	// localhost:8080/escola
	@GetMapping
	public ResponseEntity<List<Escola>> findAll() {
		List<Escola> escola = service.getAllEscola();
		return ResponseEntity.ok().body(escola);
	}

	// REQUEST POR ID
	// localhost:8080/api/escola/1
	@GetMapping("{id_escola}")
	public ResponseEntity<Escola> getEscolaById_escola(@PathVariable("id_escola") long EscolaId) {
		return new ResponseEntity<Escola>(service.getEscolaById(EscolaId), HttpStatus.OK);
	}

	// REQUEST PARA SALVAR
	// localhost:8080/escola
	@PostMapping
	public ResponseEntity<Escola> saveEscola(@RequestBody Escola escola) {
		return new ResponseEntity<Escola>(service.saveEscola(escola), HttpStatus.CREATED);
	}

	// REQUEST PARA ATUALIZAR
	// localhost:8080/escola/1
	@PutMapping("{id_escola}")
	public ResponseEntity<Escola> updateEscola(@PathVariable("id_escola") long EscolaId, @RequestBody Escola escola) {
		return new ResponseEntity<Escola>(service.updateEscola(escola, EscolaId), HttpStatus.OK);
	}

	// REQUEST PARA DELETAR
	@DeleteMapping("{id_escola}")
	public ResponseEntity<String> deleteEscola(@PathVariable("id_escola") long EscolaId) {
		service.deleteEscola(EscolaId);

		return new ResponseEntity<String>("deletado com sucesso.", HttpStatus.OK);
	}

}
