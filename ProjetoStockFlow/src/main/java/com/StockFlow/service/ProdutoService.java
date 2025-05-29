package com.StockFlow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StockFlow.entity.Produto;
import com.StockFlow.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List <Produto>buscarProdutos(){
		return produtoRepository.findAll();
	}
	
	public Produto inserir(Produto produto) {
		Produto novoProduto = produtoRepository.saveAndFlush(produto);
		return novoProduto;
	}
	
	public Produto alterar(Produto produto) {
		return produtoRepository.saveAndFlush(produto);
	}
	
	public void excluir(Long id) {
		Produto produto = produtoRepository.findById(id).get();
		produtoRepository.delete(produto);
	}
}
