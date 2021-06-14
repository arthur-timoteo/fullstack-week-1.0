package br.com.arthur.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.arthur.backend.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
