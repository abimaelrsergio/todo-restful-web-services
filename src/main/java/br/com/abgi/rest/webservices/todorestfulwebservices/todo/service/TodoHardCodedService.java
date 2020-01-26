package br.com.abgi.rest.webservices.todorestfulwebservices.todo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.abgi.rest.webservices.todorestfulwebservices.todo.Todo;

@Service
public class TodoHardCodedService {

	private static List<Todo> todos = new ArrayList<>();
	private static int idCounter = 0;

	static {
		todos.add(new Todo(++idCounter, "Guarda Civil", "Uma imagem na camisa de um artista", new Date(), false));
		todos.add(new Todo(++idCounter, "Guarda Militar", "No brasil nao esta funcionando", new Date(), false));
		todos.add(new Todo(++idCounter, "Guarda-Chuva", "Esse funciona", new Date(), false));
		todos.add(new Todo(++idCounter, "Guarda-costas", "Só pra ricos", new Date(), false));
	}

	public List<Todo> findAll() {
		return todos;
	}

}
