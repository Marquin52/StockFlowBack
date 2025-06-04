package com.StockFlow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StockFlow.entity.Categoria;
import com.StockFlow.repository.CategoriaRepository;


@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria>buscarTodos(){
		return categoriaRepository.findAll();
	}
	
	public Categoria Inserir(Categoria categoria) {
		Categoria novaCategoria= categoriaRepository.saveAndFlush(categoria);
		return novaCategoria;
	}
	
	public Categoria alterar(Categoria categoria) {
		return categoriaRepository.saveAndFlush(categoria);
	}
	
	public void excluir(Long id) {
		Categoria categoria = categoriaRepository.findById(id).get();
		categoriaRepository.delete(categoria);
	}
}
