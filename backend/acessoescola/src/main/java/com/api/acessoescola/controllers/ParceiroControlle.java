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
import com.api.acessoescola.model.Parceiro;
import com.api.acessoescola.serviceImpl.ParceiroServiceImpl;

@RestController
@RequestMapping("/parceiro")
@CrossOrigin("*")
public class ParceiroControlle {

	@Autowired
	private ParceiroServiceImpl service;

	@GetMapping("/home")
	public String hello() {
		return "oi";
	}

	// localhost:8080/api4
	@GetMapping
	public ResponseEntity<List<Parceiro>> findAll() {
		List<Parceiro> parceiro = service.getAllParceiro();

		return ResponseEntity.ok().body(parceiro);

	}

	// localhost:8080/api4 REQUEST POR ID
	@GetMapping("{id_parceiro}")
	public ResponseEntity<Parceiro> getParceiroById_Parceiro(@PathVariable("id_parceiro") long ParceiroId) {
		return new ResponseEntity<Parceiro>(service.getParceiroById(ParceiroId), HttpStatus.OK);
	}

	// REQUEST PARA SALVAR
	@PostMapping
	public ResponseEntity<Parceiro> saveParceiro(@RequestBody Parceiro parceiro) {
		return new ResponseEntity<Parceiro>(service.saveParceiro(parceiro), HttpStatus.CREATED);
	}

	// REQUEST PARA ATUALIZAR
	@PutMapping("{id_parceiro}")
	public ResponseEntity<Parceiro> updateParceiro(@PathVariable("id_parceiro") long ParceiraId,
			@RequestBody Parceiro parceiro) {
		return new ResponseEntity<Parceiro>(service.updateParceiro(parceiro, ParceiraId), HttpStatus.OK);
	}

	// REQUEST PARA DELETAR
	@DeleteMapping("{id_parceiro}")
	public ResponseEntity<String> deleteParceiro(@PathVariable("id_parceiro") long ParceiroId) {
		service.deleteParceiro(ParceiroId);

		return new ResponseEntity<String>("Deletado com sucesso.", HttpStatus.OK);
	}

}
