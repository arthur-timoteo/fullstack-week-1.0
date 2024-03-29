package br.com.arthur.backend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.arthur.backend.domain.GruposPrioridades;
import br.com.arthur.backend.repository.GruposPrioridadesRepository;

@RestController
@RequestMapping("/gruposprioridades")
public class GruposPrioridadesResource {

	@Autowired
	private GruposPrioridadesRepository gruposPrioridadesRepository;
	
	@GetMapping
	public List<GruposPrioridades> listarTodos(){
		return gruposPrioridadesRepository.findAll();
	}
	
	@GetMapping("/{codigo}")
	public GruposPrioridades buscarPeloCodigo(@PathVariable("codigo") Long codigo){
		return gruposPrioridadesRepository.findById(codigo).orElse(null);
	}
}
