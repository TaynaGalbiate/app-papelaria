package br.com.papelaria.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.papelaria.projeto.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
