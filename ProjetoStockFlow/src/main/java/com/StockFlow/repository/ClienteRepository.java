package com.StockFlow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StockFlow.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
