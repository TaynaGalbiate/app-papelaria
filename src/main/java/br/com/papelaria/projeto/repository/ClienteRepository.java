package br.com.papelaria.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.papelaria.projeto.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
