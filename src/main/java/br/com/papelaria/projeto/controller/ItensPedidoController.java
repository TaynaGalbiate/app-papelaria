package br.com.papelaria.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.papelaria.projeto.domain.ItensPedido;
import br.com.papelaria.projeto.repository.ItensPedidoRepository;

@RestController
public class ItensPedidoController {
	
	//Auto instância da interface em tempo de execução
	@Autowired
	private ItensPedidoRepository ur;
	
	@GetMapping("/itenspedido/listar")
	public List<ItensPedido> listar(){
		return ur.findAll();
	}
	
	@PostMapping("/itenspedido/cadastrar")
	public String cadastrar(@RequestBody ItensPedido us) {
		String msg="";
		ur.save(us);
		msg = "Cadastrou";
		return msg;
	}

}