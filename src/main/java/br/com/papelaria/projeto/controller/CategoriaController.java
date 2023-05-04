package br.com.papelaria.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.papelaria.projeto.domain.Categoria;
import br.com.papelaria.projeto.repository.CategoriaRepository;

@RestController
public class CategoriaController {
	
	//Auto instância da interface em tempo de execução
	@Autowired
	private CategoriaRepository ur;
	
	@GetMapping("/categoria/listar")
	public List<Categoria> listar(){
		return ur.findAll();
	}
	
	@PostMapping("/categoria/cadastrar")
	public String cadastrar(@RequestBody Categoria us) {
		String msg="";
		ur.save(us);
		msg = "Cadastrou!";
		return msg;
	}

}
