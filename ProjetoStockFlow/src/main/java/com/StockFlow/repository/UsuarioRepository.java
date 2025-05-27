package com.StockFlow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StockFlow.entity.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{

}
