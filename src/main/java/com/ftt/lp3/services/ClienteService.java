package com.ftt.lp3.services;
//f0858ba0-6457-4586-b15d-4a9c34d5a1ef
import java.util.List;

import com.ftt.lp3.documents.Cliente;

public interface ClienteService {

	List<Cliente> listarTodos();
	
	Cliente listarPorId(String id);
	
	Cliente cadastrar(Cliente cliente);
	
	Cliente atualizar(Cliente cliente);
	
	void remover(String id);
	
}
