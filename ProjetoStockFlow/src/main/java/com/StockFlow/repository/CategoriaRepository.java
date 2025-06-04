package com.StockFlow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StockFlow.entity.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Long> {

}
