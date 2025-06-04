package com.StockFlow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StockFlow.entity.Cliente;
import com.StockFlow.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente>buscarTodos(){
		return clienteRepository.findAll();
	}
	
	public Cliente Inserir(Cliente cliente) {
		Cliente novoCliente = clienteRepository.saveAndFlush(cliente);
		return novoCliente;
	}
	
	public Cliente alterar(Cliente cliente) {
		return clienteRepository.saveAndFlush(cliente);
	}
	
	public void excluir(Long id) {
		Cliente cliente = clienteRepository.findById(id).get();
		clienteRepository.delete(cliente);
	}
}
