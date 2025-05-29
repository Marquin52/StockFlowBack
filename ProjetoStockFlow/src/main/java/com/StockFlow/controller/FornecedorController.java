package com.StockFlow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StockFlow.entity.Fornecedor;
import com.StockFlow.service.FornecedorService;

@RestController
@RequestMapping("/api/fornecedor")
public class FornecedorController {
	@Autowired
	FornecedorService fornecedorService;
	
	@GetMapping("/")
	public List<Fornecedor>buscarFornecedor(){
		return fornecedorService.buscarFornecedor();
	}
	
	@PostMapping("/")
	public Fornecedor inserir(@RequestBody Fornecedor fornecedor) {
		return fornecedorService.inserir(fornecedor);
	}
	
	@PutMapping("/")
	public Fornecedor alterar(@RequestBody Fornecedor fornecedor) {
		return fornecedorService.alterar(fornecedor);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable ("id")Long id){
		fornecedorService.excluir(id);
		return ResponseEntity.ok().build();
	}
}
