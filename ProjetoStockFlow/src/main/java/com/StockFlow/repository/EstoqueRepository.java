package com.StockFlow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StockFlow.entity.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, Long>{

}
