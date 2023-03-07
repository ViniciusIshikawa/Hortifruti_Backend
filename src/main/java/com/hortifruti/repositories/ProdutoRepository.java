package com.hortifruti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hortifruti.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
