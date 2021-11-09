package org.generation.projetoIntegrador.controller;

import java.util.List;

import org.generation.projetoIntegrador.model.Tema;
import org.generation.projetoIntegrador.repository.TemaRepository;
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

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/tema")
public class TemaController {

	@Autowired
	private TemaRepository repository;

	@GetMapping // Achando os temas
	public ResponseEntity<List<Tema>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/{id_tema}") // Achando os temas pelo id_tema
	public ResponseEntity<Tema> getById(@PathVariable long id_tema) {
		return repository.findById(id_tema).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/nome_categoria/{nome_categoria}") // Achando os temas pelo nome_categoria
	public ResponseEntity<List<Tema>> getByName(@PathVariable String nome_categoria) {
		return ResponseEntity.ok(repository.findAllByTemaNomeCategoriaContainingIgnoreCase(nome_categoria));
	}// apenas para o adm criar

	// @GetMapping("/postagens_salvas/{postagens_salvas}")Como fazer??? não sei.

	@PostMapping // Criação de um novo dado para a entidade tema
	public ResponseEntity<Tema> postTema(@RequestBody Tema tema) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(tema));
	}

	@PutMapping // atualizano dado da entidade tema
	public ResponseEntity<Tema> putTema(@RequestBody Tema tema) {
		return ResponseEntity.ok(repository.save(tema));
	}

	@DeleteMapping("/{id_tema}")
	public void delete(@PathVariable long id_tema) {
		repository.deleteById(id_tema);
	}

}
