package br.com.papelaria.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.papelaria.projeto.domain.Produto;
import br.com.papelaria.projeto.repository.ProdutoRepository;

@RestController
public class ProdutoController {
	
	//Auto instância da interface em tempo de execução
	@Autowired
	private ProdutoRepository ur;
	
	@GetMapping("/produto/listar")
	public List<Produto> listar(){
		return ur.findAll();
	}
	
	@PostMapping("/produto/cadastrar")
	public String produto(@RequestBody Produto us) {
		String msg="";
		ur.save(us);
		msg = "Cadastrou";
		return msg;
	}

}