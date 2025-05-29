package com.StockFlow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StockFlow.entity.Fornecedor;
import com.StockFlow.repository.FornecedorRepository;

@Service
public class FornecedorService {
	
	@Autowired
	public FornecedorRepository fornecedorRepository;
	
	public List<Fornecedor>buscarFornecedor(){
		return fornecedorRepository.findAll();
	}
	
	public Fornecedor inserir(Fornecedor fornecedor) {
		Fornecedor novoFornecedor = fornecedorRepository.saveAndFlush(fornecedor);
		return novoFornecedor;
	}
	
	public Fornecedor alterar(Fornecedor fornecedor) {
		return fornecedorRepository.saveAndFlush(fornecedor);
	}
	
	public void excluir(Long id) {
		Fornecedor fornecedor = fornecedorRepository.findById(id).get();
		fornecedorRepository.delete(fornecedor);
	}
}
