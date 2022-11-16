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

import com.api.acessoescola.model.FaleConosco;
import com.api.acessoescola.serviceImpl.FaleConoscoServiceImpl;

@RestController
@RequestMapping("/faleconosco")
@CrossOrigin("*")
public class FaleConoscoController {

	@Autowired
	private FaleConoscoServiceImpl service;

	// REQUEST TESTE
	@GetMapping("/home")
	public String hello() {
		return "oi";
	}

	// localhost:8080/api/FaleConosco
	@GetMapping
	public ResponseEntity<List<FaleConosco>> findAll() {
		List<FaleConosco> faleConosco = service.getAllFaleConosco();
		return ResponseEntity.ok().body(faleConosco);
	}

	// REQUEST POR ID
	// localhost:8080/api/FaleConosco/1
	@GetMapping("{id}")
	public ResponseEntity<FaleConosco> getFaleConoscoById(@PathVariable("id") long FaleConoscoId) {
		return new ResponseEntity<FaleConosco>(service.getFaleConoscoById(FaleConoscoId), HttpStatus.OK);
	}

	// REQUEST PARA SALVAR
	// localhost:8080/api/FaleConosco
	@PostMapping
	public ResponseEntity<FaleConosco> saveFaleConosco(@RequestBody FaleConosco faleConosco) {
		return new ResponseEntity<FaleConosco>(service.saveFaleConosco(faleConosco), HttpStatus.CREATED);
	}

	// REQUEST PARA ATUALIZAR
	// localhost:8080/api/FaleConosco/1
	@PutMapping("{id}")
	public ResponseEntity<FaleConosco> updateFaleConosco(@PathVariable("id") long FaleConoscoId,
			@RequestBody FaleConosco faleConosco) {
		return new ResponseEntity<FaleConosco>(service.updateFaleConosco(faleConosco, FaleConoscoId), HttpStatus.OK);
	}

	// REQUEST PARA DELETAR
	// localhost:8080/api/FaleConosco/id
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteFaleConosco(@PathVariable("id") long FaleConoscoId) {
		service.deleteFaleConosco(FaleConoscoId);

		return new ResponseEntity<String>("deletado com sucesso.", HttpStatus.OK);
	}

}
