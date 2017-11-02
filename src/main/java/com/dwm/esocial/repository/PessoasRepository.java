package com.dwm.esocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dwm.esocial.domain.Pessoa;

public interface PessoasRepository extends JpaRepository<Pessoa, Long>{

}
