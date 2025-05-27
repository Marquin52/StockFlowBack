package com.StockFlow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StockFlow.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
