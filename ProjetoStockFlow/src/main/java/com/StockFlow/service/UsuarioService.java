package com.StockFlow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.StockFlow.entity.Usuario;
import com.StockFlow.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> buscarTodos(){
		return usuarioRepository.findAll();
	}
	
	public Usuario inserir(Usuario usuario) {
		Usuario novoUsuario = usuarioRepository.saveAndFlush(usuario);
		return novoUsuario;
	}
	
	public Usuario alterar(Usuario usuario) {
		return usuarioRepository.saveAndFlush(usuario);
	}
	
	public void excluir(Long id) {
		Usuario usuario = usuarioRepository.findById(id).get();
		usuarioRepository.delete(usuario);
	}
}
